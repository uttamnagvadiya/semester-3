import java.util.Scanner;

class List{
    Node head;
    int count = 1;
    public static class Node{
        double value;
        Node nextAddress;

        public Node(double value){
            this.value = value;
            nextAddress = null;
        }
    }

    public void push(double value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            System.out.println("Node is Inserted Successfully!");
        }
        else{
            Node temp = head;
            while (temp.nextAddress != null){
                temp = temp.nextAddress;
            }
            temp.nextAddress = newNode;
            System.out.println("Node is Inserted Successfully!");
        }
    }

    public void pop(){
        if (head == null)
            System.out.println("Sorry! you can not delete element because list is empty.");
        else{
            Node temp = head;
            while(temp.nextAddress.nextAddress != null)
                temp = temp.nextAddress;
            
            temp.nextAddress = null;
            System.out.println("Node is Deleted Successfully!");
        }
    }

    public void displayList(){
        Node temp = head;
        if (head == null)
            System.out.println("empty");
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.nextAddress;
        }
    }

}


public class LinkedList_Implementing_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List li = new List();

        while (true){
            System.out.print("Enter the you want to perform Operation : ");
            switch (sc.nextInt()) {
                case 2:
                    li.pop();
                    break;

                case 1:
                    System.out.print("Enter the Value : ");
                    li.push(sc.nextDouble());
                    break;

                case 3:
                    li.displayList();
                    break;

            }
        }
    }
}

package linkedlist;
class Node {      //for implementing linkedlist we have to declare a self defined datatype
    int data;
    Node next;
    //constructor
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class arraytoLL {
    public static Node convertArraytoLL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static int lengthofLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static int searchInLL(Node head, int value){
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                return 1;
            }
            else{
                temp = temp.next;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int [] arr = {12,11,10,13};
        Node head = convertArraytoLL(arr);
//        System.out.println(head.data);
        //traversing a LL
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println(lengthofLL(head));
        System.out.println(searchInLL(head , 15));
    }
}

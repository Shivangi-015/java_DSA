package linkedlist;
//class Node {      //for implementing linkedlist we have to declare a self defined datatype
//    int data;
//    Node next;
//    //constructor
//    Node(int data1, Node next1){
//        this.data = data1;
//        this.next = next1;
//    }
//    Node(int data1){
//        this.data = data1;
//        this.next = null;
//    }
//}
public class linkedList {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        Node node1 = new Node(nums[3]);
        System.out.println(node1.data);
    }
}

package linkedlist;

public class reverseDLL {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data1, Node next1, Node prev1){
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
        }
        Node(int data1){
            this.data = data1;
            this.next = null;
            this.prev = null;
        }
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static Node arraytoDLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static Node reverseaDll(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node last = null;
        Node current = head;
        while(current != null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }
        head = last.prev;
        return head;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        Node head = arraytoDLL(arr);
        head = reverseaDll(head);
        print(head);
    }
}

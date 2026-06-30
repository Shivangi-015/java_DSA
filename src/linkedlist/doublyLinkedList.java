package linkedlist;

public class doublyLinkedList {
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
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
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
    static Node deleteHeadofDLL(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }
//    static Node deletetailofDLL(Node head){
//        if(head == null || head.next == null){
//            return null;
//        }
//        Node prev = head;
//        while(prev.next.next != null){
//            prev = prev.next;
//        }
//        Node temp = prev.next;
//        temp.prev = null;
//        prev.next = null;
//        return head;
//    }
    static Node deletetailofDLL(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node back = tail.prev;
        back.next = null;
        tail.prev = null;
        return head;
    }
    static Node deleteKthElement(Node head, int k){
        if(head == null){
            return null;
        }
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;

        if(back == null && front == null){
            return null;
        }
        else if(back == null){ //we are at head
            deleteHeadofDLL(head);
        }
        else if(front == null){ //we are at tail
            deletetailofDLL(head);
        }
        else{
            back.next = front;
            front.prev = back;
            temp.prev = null;
            temp.next = null;
        }
        return head;
    }
    static void deleteNode(Node temp){
        Node back = temp.prev;
        Node front = temp.next;
        if(front == null){
            back.next = null;
            temp.prev = null;
            return;
        }
        back.next = front;
        front.prev = back;

        temp.next = temp.prev = null;
    }

    //insertion in DLL
    static Node insertbeforeHead(Node head, int value){
        Node newHead = new Node(value, head, null);
        head.prev = newHead;
        return newHead;
    }

    static Node insertBeforeTail(Node head, int value){
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node back = tail.prev;

        Node newNode = new Node(value, tail, back);
        back.next = newNode;
        tail.prev = newNode;
        return head;
    }
    static Node insertBeforeKthelement(Node head,int k, int value){
        if(k==1){
            return insertbeforeHead(head, value);
        }
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(value, temp, back);
        back.next = newNode;
        temp.prev = newNode;
        return head;
    }
    static void insertBeforeNode(Node node, int value){
        Node back = node.prev;
        Node newNode = new Node(value, node, back);
        back.next = newNode;
        node.prev = newNode;
    }

    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        Node head = arraytoDLL(arr);
        insertBeforeNode(head.next.next , 500);
        print(head);
    }
}

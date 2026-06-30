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
    public static Node removeTail (Node head){
        Node temp = head;
        if(head == null || head.next == null){
            return null;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
         temp.next = null;
        return head;
    }
    public static Node deleteAtK(Node head, int k){
        if(head == null){
            return head;
        }
        if(k==1){
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while(temp!= null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node deleteEl(Node head, int el){
        if(head == null){
            return head;
        }
        if(head.data == el){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp!= null){
            if(temp.data == el){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node insertionAtTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    public static Node insertionAtPositionK(Node head, int element, int k){
        if (head == null){
            if(k==1){
                return new Node(element);
            }
            else{
                return head;
            }
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k-1){
                Node newN = new Node(element);
                newN.next = temp.next;
                temp.next = newN;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node insertBeforeValue(Node head, int element, int value){
        if(head == null){
            return head;
        }
        if(head.data == value){
            return new Node(element, head);
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == value){
                Node x = new Node(element, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
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
        //System.out.println(searchInLL(head , 15));
        //head = deleteEl(head, 11);
       // head = new Node(100, head); inserting at head
        //head = insertionAtTail(head, 21);
        //head = insertionAtPositionK(head, 44, 5);
        head = insertBeforeValue(head, 21, 11);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

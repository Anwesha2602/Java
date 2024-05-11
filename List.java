class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;
    
    void insert(int val){
        Node node = new Node();
        node.data=val;
        node.next=null;
        if (head==null){
            head=node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    void insertAtPos(int pos,int val){
        Node node = new Node();
        Node prev=null;
        node.data=val;
        Node n = head;
        for(int i=1;i<pos;i++){
            prev = n;
            n=n.next;
        }
        node.next=n;
        prev.next=node;

    }
    void insertAtEnd(int val){
        Node node = new Node();
        node.data=val;
        node.next=null;
        Node n = head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=node;

    }
    void delAtStart(){
        System.out.println("deleted value is "+head.data);
        head=head.next;
    }
    void delAtPos(int pos){
        Node n = head;
        Node prev = null;
        for(int i=1;i<pos;i++){
            prev = n;
            n=n.next;
        }
        System.out.println("deleted value is "+n.data);
        prev.next=n.next;
        n=null;
    }
    void delAtEnd(){
        Node n = head;
        Node prev = null;
        while(n.next!=null){
            prev =n;
            n=n.next;
        }
        System.out.println("deleted value is "+n.data);
        n=null;
        prev.next=null;
    }

    void show(){
        Node n = head;
        if(n==null){
            System.out.println("empty list");
        }
        else{
            while(n!=null){
                System.out.println(n.data);
                n=n.next;
            }
        }
    }
}

public class List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(15);
        list.insert(3);
        list.insertAtPos(2,13);
        list.insertAtEnd(100);
        // list.delAtStart();
        //list.delAtPos(3);
        list.delAtEnd();

        list.show();
    }
}

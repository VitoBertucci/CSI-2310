package Classes;
    //linked list
public class linkedList {

    public static Node head; //front of list
    public static Node tail; //back of list

    //insert node
    public void insert(int data) {
        Node n = new Node(data);
        head = n;
        tail = n;
    }

    //add node to list head
    public void insertHead(int data) {
        Node n = new Node(data);
        head.prev = n;
        n.next = head;
        head = n;
    }


    //tail.next = new Node(data).prev = tail = new Node(data);
    //add node to tail
    public void insertTail(int data) {
        Node n = new Node(data);
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    //get node with specified data
    public Node search(int key) {
        Node x = head;
        while(x != null && x.data != key) {
            x = x.next;
        }
        return x;
    }

    //insert node with specified data after different node with specified data
    public void insertAfter(int newData, int key) {
        Node n = new Node(newData);
        
        n.prev = search(key);
        n.next = search(key).next;
        search(key).next = n;
        n.next.prev = n;
    }

    //display alll nodes
    public void display() {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

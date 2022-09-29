package Classes;
    //node
public class Node {
    private int data;
    public Node next;
    public Node prev; 

    public Node (int d) {
        data = d;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    
}

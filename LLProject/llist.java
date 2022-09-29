package LLProject;
import Classes.linkedList;

public class llist {
    //linked list project for lab

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert(5);
        list.insertTail(7);
        list.insertHead(4);
        list.insertAfter(6, 5);
        list.display();
    }
}

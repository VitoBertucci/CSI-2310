package MainAssignments.Project1;

public class IntNode {

    private int sequenceNumber;
    private int data;
    private IntNode link;


    /*  Precondition:
        Postcondition: All instance variables of the IntNode class are initialized in order.
    */ 
    public IntNode(int initialsequenceNumber, int initialdata, IntNode initialLink) {

        sequenceNumber = initialsequenceNumber;
        data = initialdata;
        link = initialLink;

        //sequence number should be equal to the last node's sequence number plus 1
    }


    /* Precondition:  This instance of the IntNode class exists. In other words, the object 
                      whose method is activated exists as a node in the linked list. 
       Postcondition: A new node with attributes item and data is created. Item serves as sequenceNumber.
                      The new node is added to the linked list at a position that comes immediately after 
                      the node whose method is activated. 
    */
    public void addNodeAfter(int item, int data) {
        
        //create new node with sequence number 1 after current node and data equal to argument data
        //set new node's link to the current nodes link
        IntNode addedNode = new IntNode(this.sequenceNumber + 1, data, link);

        //set the current nodes link to the new node
        this.link = addedNode;

        //NEED TO CHANGE THE REST OF THE SEQUENCE NUMBERS AHEAD OF CURRENT NODE

        //add 1 to the next nodes sequence number
        addedNode.link.sequenceNumber = addedNode.sequenceNumber + 1;
    }


    /* Precondition: This instance of the IntNode class exists. In other words, the 
                     object whose method is activated exists as a node in the linked list. 
      Postcondition: The specific node, which comes immediately after the node whose 
                     method is activated, is removed from the linked list. 
    */
    public void removeNodeAfter() {  

        //set the current node's link to the next nodes link
        this.link = this.link.link;

        //subtract the next node's sequenec number by 1
        this.link.sequenceNumber -= 1;
        
    } 


    /* Precondition:  This instance of the IntNode class exists.
       Postcondition: The sequenceNumber of this node is returned.
    */
    public int getsequenceNumber() {

        //return the current node's sequence number
        return sequenceNumber;
    }


    /* Precondition:  This instance of the IntNode class exists.
       Postcondition: The link of this node is returned. */
    public IntNode getLink() {

        //return the current node's link to the next node
        return link;                                     
    } 


    /* Precondition:  The linked list contains at least one element.
       Postcondition: The (sequence number, data) pairs of each node in the linked list, starting with the head,
                      are displayed on the monitor.
    */
    public void displayNodeData(IntNode head) {

        //print data of current node in console
        System.out.println(head.data);
    }


    /* Precondition:  The head of the linked list is different than null, and its sequenceNumber is different than target.
       Postcondition: The link to the specific node, which comes before the node whose sequenceNumber is equal to target, 
                      is returned. If the linked list does not contain a node with sequenceNumber equal to target, then null is returned.
    
    
       Return the previous node of the target sequence number, if no such node exists, return null. (If looking for node previous to
       the node with sequence number 12, and a node with sequence number 11 exists, return node with seq num 11. If node with target
       sequence number does not exist, return **NULL**)
    */
    public IntNode findPrevious(IntNode head, int target) {

        
        // Implement me.
        return head;
    }


    /* Precondition:  The head of the linked list is different than null, and its sequenceNumber is smaller than target.
       Postcondition: Return the link to the specific node before the node that is the first in the linked list to have a 
                      sequenceNumber greater than target. If no such node is found, the link to the last node in the linked list is returned.

       Return the previous node of the target node sequence number, if no node exists with that sequence number, return the **most recent
       previous node** (if looking for node w sequence number 11, but only 10 and 12 exists, return node with sequence number 10)
    */
    public IntNode locatePredecessor(IntNode head, int target) {

        // Implement me.

        return head;
    }
  
}
           
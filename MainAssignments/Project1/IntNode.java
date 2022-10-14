package MainAssignments.Project1;

//Vito Bertucci
//Bryan Veres

public class IntNode {
   private int sequenceNumber; //seq num of the node
   private int data; //data of the node
   private IntNode link; //next

   // Precondition:
   // Postcondition: All instance variables of the IntNode class are initialized in order.
   public IntNode(int initialsequenceNumber, int initialdata, IntNode initialLink) {
      this.sequenceNumber = initialsequenceNumber;
      this.data = initialdata;
      this.link = initialLink;
   }

   // Precondition: This instance of the IntNode class exists.
   // In other words, the object whose method is activated exists as a node in the linked list. 
   // Postcondition: A new node with attributes item and data is created. Item serves as sequenceNumber.
   // The new node is added to the linked list at a position that comes immediately after the node whose method is activated.
   public void addNodeAfter(int target, int data) {

         //create new node with sequence number of target nd data equal to data
         //set new node's link to the current nodes link
         IntNode addedNode = new IntNode(target, data, this.link);

         //set the current nodes link to the new node
         this.link = addedNode;
   }

   // Precondition: This instance of the IntNode class exists.
   // In other words, the object whose method is activated exists as a node in the linked list. 
   // Postcondition: The specific node, which comes immediately after the node whose method is activated, 
   // is removed from the linked list.
   public void removeNodeAfter() {
      this.link = null;
   }
   
   // Precondition: The head of the linked list is different than null, and its sequenceNumber is different than target.
   // Postcondition: The link to the specific node, which comes before the node whose sequenceNumber is equal to target, 
   // is returned. If the linked list does not contain a node with sequenceNumber equal to target, then null is returned.
   public IntNode findPrevious(IntNode head, int target) {
      //set a previous node and a current node that is one node right of the previous node
      IntNode prev = head;
      IntNode current = head.link;
      //if the current node is null before iterating through the loop (if there is one node in the list)
      if(current == null) {
         return prev;
      }
      //iterate until target is reached or passed
      while(current != null) {
         //if the current node's sequence number is the target, return the previous node
         if (current.sequenceNumber == target) {
            return prev;
         } else {
            //if it is not then move over
            prev = prev.link;
            current = current.link;
         }
      }
      //if the target is passed return null (the target is never found or not in the list)
      return null;
  }

   // Precondition: The head of the linked list is different than null, and its sequenceNumber is smaller than target.
   // Postcondition: The link to the specific node, which comes before the node that is the first in the linked list 
   // to have a sequenceNumber greater than target, is returned. 
   // If no such node is found, the link to the last node in the linked list is returned. 
   public IntNode locatePredecessor(IntNode head, int target) {
      //set a previous node and a current node that is one node right of the previous node
      IntNode prev = head;
      IntNode current = head.link;
      //if the current node is null before iterating through the loop (if there is one node in the list)
      if(current == null) {
         return prev;
      }
      //iterate until target is reached or passed
      while(current != null) {
         //if the current node's sequence number is the target, return the previous node
         if (current.sequenceNumber == target) {
            return prev;
         } else {
            //if it is not then move over
            prev = prev.link;
            current = current.link;
         }
      }
      //if the target is passed return the previous node anyways (the target is never found or not in the list)
      return prev;
   }
   
   // Precondition: This instance of the IntNode class exists.
   // Postcondition: The sequenceNumber of this node is returned.
   public int getsequenceNumber( ) {
      return sequenceNumber;
   }
   
   // Precondition: This instance of the IntNode class exists.
   // Postcondition: The link of this node is returned.
   public IntNode getLink( ) {
      return link;
   } 

   // Precondition: The linked list contains at least one element.
   // Postcondition: The (sequence number, data) pairs of each node in the linked list, starting with the head,
   // are displayed on the monitor.
   public void displayNodeData(IntNode head) {
      System.out.print("The (sequence number, data) pairs in the list are: ");
      while (head != null) {
         System.out.print("(" + head.sequenceNumber + ", " + head.data + ") ");
         head = head.link;
      }
      System.out.println('\n');
   }
}
           
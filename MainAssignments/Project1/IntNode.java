package MainAssignments.Project1;

public class IntNode {
   private int sequenceNumber; 
   private int data; 
   private IntNode link; 

   public IntNode(int initialsequenceNumber, int initialdata, IntNode initialLink) {
      this.sequenceNumber = initialsequenceNumber;
      this.data = initialdata;
      this.link = initialLink;
   }

   public void addNodeAfter(int target, int data) {
         IntNode addedNode = new IntNode(target, data, this.link);
         this.link = addedNode;
   }

   public void removeNodeAfter() {
      this.link = null;
   }

   public IntNode findPrevious(IntNode head, int target) {
      IntNode prev = head;
      IntNode current = head.link;

      if(current == null) {
         return prev;
      }

      while(current != null) {

         if (current.sequenceNumber == target) {
            return prev;
         } else {
            prev = prev.link;
            current = current.link;
         }
      }
      return null;
  }

   public IntNode locatePredecessor(IntNode head, int target) {
      IntNode prev = head;
      IntNode current = head.link;

      if(current == null) {
         return prev;
      }

      while(current != null) {

         if (current.sequenceNumber == target) {
            return prev;
         } else {
            prev = prev.link;
            current = current.link;
         }
      }
      return prev;
   }
   
   public int getsequenceNumber( ) {
      return sequenceNumber;
   }
   
   public IntNode getLink( ) {
      return link;
   }

   public void displayNodeData(IntNode head) {
      System.out.print("The (sequence number, data) pairs in the list are: ");
      
      while (head != null) {
         System.out.print("(" + head.sequenceNumber + ", " + head.data + ") ");
         head = head.link;
      }
      System.out.println('\n');
   }
}
           
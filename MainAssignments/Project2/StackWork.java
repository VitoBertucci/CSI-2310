package MainAssignments.Project2;

public class StackWork
{
    public int[] S0;
    public int S0top;   
    public int S0length;
   
    public int[] S1;
    public int S1top;   
    public int S1length;
   
    public int[] S2;
    public int S2top;   
    public int S2length;
   
   
   // Precondition: S0size, S1size, and S2size are greater than 0.
   // Postcondition: The stacks S0, S1, and S2, are created, and their respective lengths are initialized.

    //intitialize new int[] arrays with their respective size
    //set their tops to -1 since they are empty
    //set their lengths to the given size (i never used these i always used array.length but initialize it anyways)

    public StackWork(int S0size, int S1size, int S2size) {

        if (S0size >= 0 && S1size >= 0 && S2size >= 0) {
            S0 = new int[S0size];
            S1 = new int[S1size];
            S2 = new int[S2size];

            S0length = S0size;
            S1length = S1size;
            S2length = S2size;

            S0top = -1;
            S2top = -1;
            S1top = -1;
        }
    }

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then the new element x is inserted in stack S0. If StackSelector is 1, 
   // then the new element x is inserted in stack S1. If StackSelector is 2, then the new element x is inserted 
   // in stack S2.

    //StackSelector is either 0, 1, or 2, it picks whick stack to act on, can handle this any way you want (switch/ifelse)
    //add value x to top of stack, (use ++top because this will increment the top before the value is added to the stack)

    public void Push(int x, int StackSelector) {
        switch(StackSelector) {
            case 0: 
                S0[++S0top] = x;
                break;
            case 1: 
                S1[++S1top] = x;
                break;
            case 2: 
                S2[++S2top] = x;
                break;
            default: 
                break;
        }
    }
   

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then an element is taken out of stack S0 and is returned to the caller. 
   // If StackSelector is 1, then an element is taken out of stack S1 and is returned to the caller.
   // If StackSelector is 2, then an element is taken out of stack S2 and is returned to the caller.

   //same exact idea here, but this time deincrement the top with top-- and return what was at the top as the value
   //top-- is used so that the value is removed from the the stack and we can return it to use somewhere else
 
    public int Pop(int StackSelector) {
         switch(StackSelector) {
            case 0: 
                return S0[S0top--];
            case 1: 
                return S1[S0top--];
            case 2: 
                return S2[S0top--];
            default:
                return -1; 
         }
    }
   
   
   // Precondition: 
   // Postcondition: The elements of the stack S0 are displayed, followed by the elements of the stack S1, and in the end
   // the elements of the Stack S2.
    
   //just dispplay the stacks like in the outline

    public void displayStackData() {

        System.out.print("\nData in S0: ");
        for(int i = 0; i < S0top+1; i++) {
            System.out.print(S0[i] + " ");
        }

        System.out.print("\nData in S1: ");
        for(int i = 0; i < S1top+1; i++) {
            System.out.print(S1[i] + " ");
        }

        System.out.print("\nData in S2: ");
        for(int i = 0; i < S2top+1; i++) {
            System.out.print(S2[i] + " ");
        }
   }

      
    // Precondition: The StackWork object exists.
    // Postcondition: The instance variable S0top is returned.
    public int getS0top() {
	    return S0top;
    }
   
}	
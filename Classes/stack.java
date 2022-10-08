package Classes;

public class stack {
    private int top; //holds position of last ele
    private int size; //holds number of ele in ary 
    private int[] sArray; //ary for ele storage

    //const: take size and create array, set size, set top
    public stack(int size) {
        sArray = new int[size];
        this.size = size;
        top = -1;
    }

    //check if stack is empty, return true
    public boolean stackEmpty() {
        if (this.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    //check if stack is full, return true 
    public boolean stackFull() {
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }

    //store new ele at top of list
    public void push(int newData) throws ArrayIndexOutOfBoundsException{
        if (!stackFull()) {
            sArray[++top] = newData;           
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    //remove top ele of list
    public int pop() throws ArrayIndexOutOfBoundsException{
        if(!stackEmpty()) {
            return sArray[top--];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void dumpStack() {

    }
}

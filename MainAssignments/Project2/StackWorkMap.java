package MainAssignments.Project2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import Classes.stack;


public class StackWorkMap {

    public HashMap<Integer, List<Integer>> stacks = new HashMap<Integer,List<Integer>>();

    public StackWorkMap(int S0size, int S1size, int S2size) {
        stacks.put(0, new ArrayList<Integer>());
        stacks.put(1, new ArrayList<Integer>());
        stacks.put(2, new ArrayList<Integer>());
    }

    public void Push(int x, int StackSelector) {
        stacks.get(StackSelector).add(x);
    }

    public int Pop(int StackSelector) {
        int n = stacks.get(StackSelector).remove(stacks.get(StackSelector).size()-1);
        return n;
    }
    
    public void displayStackData() {

        for (Integer key : stacks.keySet()) {
            System.out.print("\nData in S" + key + ":");
            System.out.print(stacks.get(key));
        }
    }
}

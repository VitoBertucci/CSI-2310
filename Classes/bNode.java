package Classes;

public class bNode {

    bNode left;
    bNode right;
    int data;

    public bNode(int val) {
        data = val;
        left = null;
        right = null;
    }


    public bNode insertRecursive(bNode cur, int val) {
        if (cur == null) {
            return new bNode(val);
        }

        if(val < cur.data) {
            cur.left = insertRecursive(cur.left, val);
        } else if (val > cur.data) {
            cur.right = insertRecursive(cur.right, val);
        } else {
            return cur;
        }
        return cur;
    }
    
    public boolean containsNodeR(bNode cur, int val) {
        if (cur == null) {
            return false;
        }

        if(val == cur.data) {
            return true;
        }
        
        if (val < cur.data) {
            return containsNodeR(cur.left, val);
        } else {
            return containsNodeR(cur.right, val);
        }
    }

    

}

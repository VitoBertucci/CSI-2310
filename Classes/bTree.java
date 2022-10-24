package Classes;

public class bTree {
    bNode root;

    public void insert(int val) {
        root = root.insertRecursive(root, val);
    }

    public boolean containsNode(int val) {
        return root.containsNodeR(root, val);
    }
}

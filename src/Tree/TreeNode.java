package Tree;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public void setRigth(TreeNode right) {
        this.right = right;
    }
    public int getVal() {
        return val;
    }
    public TreeNode getLeft() {
        return left;
    }
    public TreeNode getRight() {
        return right;
    }
    
}

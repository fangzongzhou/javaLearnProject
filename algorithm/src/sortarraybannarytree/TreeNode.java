package sortarraybannarytree;

public class TreeNode {

    public int val;
    public TreeNode left,right;

    public TreeNode(int val) {
        this.val= val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

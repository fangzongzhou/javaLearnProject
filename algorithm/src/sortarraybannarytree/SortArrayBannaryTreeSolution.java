package sortarraybannarytree;

public class SortArrayBannaryTreeSolution {
    public static TreeNode sortedArrayToBST(int[] array) {



        return creat(array, 0,array.length-1 );
    }


    public static TreeNode creat(int[] array, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l+r+1)/2;
        System.out.println(array[mid]);
        TreeNode treeNode = new TreeNode(array[mid]);
        treeNode.left = creat(array, l, mid - 1);
        treeNode.right = creat(array, mid + 1, r);
        return treeNode;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sortedArrayToBST(array));
    }


}

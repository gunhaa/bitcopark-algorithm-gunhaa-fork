package mynote.binarySearchTree;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private Comparable data;

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public Comparable getData() {
        return data;
    }

    public TreeNode(Comparable newData) {
        this.data = newData;
        this.left = null;
        this.right = null;
    }

    public TreeNode(Comparable newData, TreeNode rightChild, TreeNode leftChild) {
        this.data = newData;
        this.right = rightChild;
        this.left = leftChild;
    }
}

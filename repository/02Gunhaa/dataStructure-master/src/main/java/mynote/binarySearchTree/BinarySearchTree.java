package mynote.binarySearchTree;


public class BinarySearchTree implements IndexInterface<TreeNode> {

    private TreeNode root;
    public BinarySearchTree(){
        root = null;
    }

    @Override
    public TreeNode search(Comparable searchKey){
        return searchItem(root, searchKey);
    }

    private TreeNode searchItem(TreeNode tNode, Comparable searchKey) {
        if(tNode == null){
            return null;
        } else if (searchKey.compareTo(tNode.getData()) == 0){
            return tNode;
        } else if (searchKey.compareTo(tNode.getData()) < 0){
            return searchItem(tNode.getLeft(), searchKey);
        } else {
            return searchItem(tNode.getRight(), searchKey);
        }
    }


    @Override
    public void insert(Comparable item) {

    }

    @Override
    public void delete(Comparable item) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}

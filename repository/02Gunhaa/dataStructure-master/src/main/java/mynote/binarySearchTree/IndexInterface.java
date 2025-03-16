package mynote.binarySearchTree;

public interface IndexInterface<T> {

    public T search(Comparable item);

    public void insert(Comparable item);

    public void delete(Comparable item);

    public boolean isEmpty();

    public void clear();
}

package mynote.arrayList;

public class MyArrayList<E> implements ArrayListADT<E> {

    private final E[] array;
    private int numItems;
    private int arraySize;

    public MyArrayList() {
        this.array = (E[]) new Object[arraySize];
    }

    @Override
    public boolean add(E obj) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E newObj) {
        return null;
    }

    @Override
    public int indexOf(E obj) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }
}

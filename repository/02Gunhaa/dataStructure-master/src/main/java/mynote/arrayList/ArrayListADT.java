package mynote.arrayList;

public interface ArrayListADT<E> {

    boolean add(E obj);

    E get(int index);

    // oldValue 반환
    E set(int index, E newObj);

    int indexOf(E obj);

    int size();

    // oldValue 반환
    E remove(int index);


}

package mynote.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWrapper<E> implements ArrayListADT<E>{

    List<E> arrayList = new ArrayList<E>();

    @Override
    public boolean add(E obj) {
        return arrayList.add(obj);
    }

    @Override
    public E get(int index) {
        return arrayList.get(index);
    }

    @Override
    public int indexOf(E obj) {
        return arrayList.indexOf(obj);
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public E remove(int index) {
        return arrayList.remove(index);
    }

    @Override
    public E set(int index, E newObj){
        E oldValue = arrayList.set(index, newObj);
        return oldValue;
    }

    @Override
    public String toString() {
        return "ArrayListWrapper{" +
                "arrayList=" + arrayList +
                '}';
    }
}

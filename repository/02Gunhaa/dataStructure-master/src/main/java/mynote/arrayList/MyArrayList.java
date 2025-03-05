package mynote.arrayList;

import java.util.Arrays;

public class MyArrayList<E> implements ArrayListADT<E> {

    private E[] array;
    private int numItems;
    private int arraySize = 2;

    public MyArrayList() {
        this.array = (E[]) new Object[arraySize];
        this.numItems = 0;
    }

    @Override
    public boolean add(E obj) {
        if(arraySize <= numItems){
            grow();
        }
        this.array[numItems++] = obj;
        return true;
    }

    private void grow(){
        E[] temp = this.array;
        this.arraySize *= 2;
        this.array = (E[]) new Object[this.arraySize];
        for(int i=0; i < temp.length; i++){
            this.array[i] = temp[i];
        }
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public E set(int index, E newObj) {
        E oldValue = array[index];
        array[index] = newObj;
        return oldValue;
    }

    @Override
    public int indexOf(E obj) {

        for (int i = 0; i < numItems; i++) {
            if(array[i] == obj){
                return i;
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public E remove(int index) {
        E oldValue = array[index];
        for (int i = index; i < numItems; i++) {
            array[i] = array[i+1];
        }
        numItems--;
        return oldValue;
    }


    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

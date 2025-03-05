package mynote.arrayList;

import mynote.stack.StackADT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListADTTest {

    @Test
    public void java_arrayList_test(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        Assertions.assertEquals(arrayList.get(1), 2);
        Assertions.assertEquals(arrayList.indexOf(2), 1);
        // oldValue 반환
        Integer set = arrayList.set(1, 111);
        System.out.println("set : "+ set);
        System.out.println(arrayList);
        Assertions.assertEquals(arrayList.get(1), 111);
        arrayList.remove(1);
        Assertions.assertEquals(arrayList.size(), 4);
        System.out.println(arrayList);
    }

    @Test
    public void java_arrayListWrapper_test(){
        ArrayListADT<Integer> arrayList = new ArrayListWrapper<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        Assertions.assertEquals(arrayList.get(1), 2);
        Assertions.assertEquals(arrayList.indexOf(2), 1);
        // oldValue 반환
        Integer set = arrayList.set(1, 111);
        System.out.println("set : "+ set);
        System.out.println(arrayList);
        Assertions.assertEquals(arrayList.get(1), 111);
        arrayList.remove(1);
        Assertions.assertEquals(arrayList.size(), 4);
        System.out.println(arrayList);
    }

    @Test
    public void java_myArrayList_test(){
        ArrayListADT<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        Assertions.assertEquals(arrayList.get(1), 2);
        Assertions.assertEquals(arrayList.indexOf(2), 1);
        // oldValue 반환
        Integer set = arrayList.set(1, 111);
        System.out.println("set : "+ set);
        System.out.println(arrayList);
        Assertions.assertEquals(arrayList.get(1), 111);
        arrayList.remove(1);
        Assertions.assertEquals(arrayList.size(), 4);
        System.out.println(arrayList);

        arrayList.remove(0);

        System.out.println(arrayList);

    }



}
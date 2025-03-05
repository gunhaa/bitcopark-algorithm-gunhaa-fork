package mynote;

import mynote.stack.MyStack;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[2];


        System.out.println(arr.length);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        arr[0] = 123;
        System.out.println(arr[0]);

        MyStack<Integer> myStack = new MyStack<>();
        System.out.println(myStack.pop());

        System.out.println("계속 실행중..");
    }
}
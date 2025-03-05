package mynote.stack;

import java.util.Arrays;

public class MyStack<E> implements StackADT<E> {

    private E[] stack;
    private int topIndex;
    private int stackSize = 2;

    public MyStack() {
        this.stack = (E[]) new Object[stackSize];
        this.topIndex = -1;
    }

    @Override
    public E pop() {
        if(this.topIndex == -1){
            throw new IllegalStateException("don't pop empty stack");
        }
        this.stack[topIndex] = null;
        this.topIndex -= 1;
        return this.stack[this.topIndex];
    }

    @Override
    public void push(E obj) {
        if(stackSize <= topIndex+1){
            grow();
        }
        this.stack[++this.topIndex]= obj;
    }

    private void grow() {
        E[] temp = this.stack;
        this.stackSize *= 2;
        this.stack = (E[]) new Object[this.stackSize];
        for (int i = 0; i < temp.length; i++) {
            this.stack[i] = temp[i];
        }
    }

    @Override
    public int search(E obj) {
        for (int i = 0; i < this.topIndex+1; i++) {
            if(this.stack[i]==obj){
                return this.topIndex-i;
            }
        }
        return -1;
    }

    @Override
    public boolean empty() {
        return this.topIndex == -1 ? true : false;
    }

    @Override
    public int size() {
        return this.topIndex+1;
    }

    @Override
    public String toString() {
        return "Stack = " + Arrays.toString(this.stack);
    }
}

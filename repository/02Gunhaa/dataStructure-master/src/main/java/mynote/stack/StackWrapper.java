package mynote.stack;

import java.util.Stack;

public class StackWrapper<E> implements StackADT<E>{

    private final Stack<E> stack = new Stack<>();

    @Override
    public E pop() {
        return stack.pop();
    }

    @Override
    public void push(E obj) {
        stack.push(obj);
    }

    @Override
    public int search(E obj) {
        return stack.search(obj);
    }

    @Override
    public boolean empty() {
        return stack.empty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return "StackWrapper{" +
                "stack=" + stack +
                '}';
    }
}

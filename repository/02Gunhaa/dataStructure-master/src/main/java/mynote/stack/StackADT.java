package mynote.stack;

public interface StackADT<E> {

    E pop();

    void push(E obj);

    int search(E obj);

    boolean empty();

    int size();

}
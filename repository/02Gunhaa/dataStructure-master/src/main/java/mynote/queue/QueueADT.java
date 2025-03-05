package mynote.queue;

public interface QueueADT<E> {

    boolean add(E obj);

    int size();

    boolean contains(E obj);

    void clear();

    boolean isEmpty();

    E poll();
}

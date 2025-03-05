package mynote.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWrapper<E> implements QueueADT<E> {

    Queue<E> queue = new LinkedList<>();

    @Override
    public boolean add(E obj) {
        return queue.add(obj);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean contains(E obj) {
        return queue.contains(obj);
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public E poll() {
        return queue.poll();
    }

    @Override
    public String toString() {
        return Arrays.toString(queue.toArray());
    }
}

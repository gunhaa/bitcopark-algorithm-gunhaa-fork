package mynote.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueADTTest {

    @Test
    public void Queue_Test(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        
        // 첫 인덱스의 원소를 삭제하면서 반환한다
        System.out.println(queue.poll());
        assertEquals(queue.size(), 4);
        assertEquals(queue.contains(6), false);
        queue.clear();
        assertEquals(queue.size(), 0);
        assertEquals(queue.isEmpty(), true);
    }

    @Test
    public void QueueWrapper_Test(){
        QueueADT<Integer> queue = new QueueWrapper<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        // 첫 인덱스의 원소를 삭제하면서 반환한다
        System.out.println(queue.poll());
        assertEquals(queue.size(), 4);
        assertEquals(queue.contains(6), false);
        queue.clear();
        assertEquals(queue.size(), 0);
        assertEquals(queue.isEmpty(), true);
    }

    @Test
    public void MyQueue_Test(){
        QueueADT<Integer> queue = new MyQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        // 첫 인덱스의 원소를 삭제하면서 반환한다
        System.out.println(queue.poll());
        assertEquals(queue.size(), 4);
        assertEquals(queue.contains(6), false);
        assertEquals(queue.contains(3), true);
        queue.clear();
        assertEquals(queue.size(), 0);
        assertEquals(queue.isEmpty(), true);
    }

}
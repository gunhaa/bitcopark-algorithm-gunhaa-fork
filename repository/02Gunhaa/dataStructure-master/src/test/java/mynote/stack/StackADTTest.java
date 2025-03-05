package mynote.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackADTTest {

    @Test
    void StackWrapper테스트(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.search(3));
        System.out.println(stack.size());

        System.out.println("======================================");

        StackADT<Integer> myStack = new StackWrapper<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        assertEquals(5, myStack.size()); // 원래 5개였음

        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.empty());
        System.out.println(myStack.search(3));
        System.out.println(myStack.size());

        // 예상 결과 검증
        assertEquals(stack.empty(),myStack.empty() ); // LIFO이므로 마지막으로 넣은 값이 나와야 함
        assertEquals(stack.size(), myStack.size()); // 하나 제거했으므로 4개 남아야 함
    }

    @Test
    void MyStack테스트(){
        StackADT<Integer> myStack = new MyStack<>();
        myStack.push(1);
        System.out.println(myStack);

        myStack.push(2);
        System.out.println(myStack);

        myStack.push(3);
        System.out.println(myStack);

        myStack.push(4);
        System.out.println(myStack);

        myStack.push(5);
        System.out.println(myStack);


        assertEquals(5, myStack.size()); // 원래 5개였음

        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.empty());
        System.out.println(myStack.search(3));
        System.out.println(myStack.search(4));
        System.out.println(myStack.size());

//        // 예상 결과 검증
//        assertEquals(myStack.empty(),false );
//        assertEquals(myStack.size(), 4); // 하나 제거했으므로 4개 남아야 함
    }


}
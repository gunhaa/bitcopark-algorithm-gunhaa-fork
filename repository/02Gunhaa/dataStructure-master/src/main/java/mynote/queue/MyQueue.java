package mynote.queue;

public class MyQueue<E> implements QueueADT<E>{

    private Node<E> head;
    private Node<E> tail;
    private int numItems;

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.numItems = 0;
    }

    @Override
    public boolean add(E obj) {
        if(this.tail == null){
            Node<E> firstNode = new Node<E>(obj);
            this.head = firstNode;
            this.tail = firstNode;
        }
        Node<E> prevNode = this.tail;
        Node<E> newTail = new Node<>(obj);

        prevNode.connectNextNode(newTail);
        this.tail = newTail;
        numItems++;
        System.out.println("나는 머리의 데이터야 : "+ head.getData());
        System.out.println("나는 꼬리의 데이터야 : "+ tail.getData());
        System.out.println("내 크기는 지금 : "+numItems);
        return true;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean contains(E obj) {

        Node<E> temp = this.head;

        for(int i=0; i<numItems; i++){
            if(obj == temp.getData()){
                return true;
            }
            temp = temp.getNextNode();
        }

        return false;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.numItems = 0;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0 ? true : false;
    }

    @Override
    public E poll() {
        Node<E> head = this.head;
        this.head = head.getNextNode();
        this.numItems--;
        return head.getData();
    }

    @Override
    public String toString() {
        return "" + numItems;
    }
}

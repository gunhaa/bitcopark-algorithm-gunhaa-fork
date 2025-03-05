package mynote.queue;

public class Node<E> {

    private Node<E> nextNode;
    private E data;
    
    public Node(E data) {
        this.nextNode = null;
        this.data = data;
    }

    public void connectNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public E getData() {
        return data;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }
}

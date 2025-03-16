package mynote.graph.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Graph {

    private Node[] nodes;

    public Graph(int size){
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    public void addEdge(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if(!n1.getAdjacent().contains(n2)){
            n1.getAdjacent().add(n2);
        }
        if(!n2.getAdjacent().contains(n1)){
            n2.getAdjacent().add(n1);
        }
    }

    public void dfs(){
        dfs(0);
    }

    private void dfs(int index){
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.setMarked(true);

        while(!stack.isEmpty()){
            Node r = stack.pop();
            for (Node n : r.getAdjacent()){
                if(!n.isMarked()){
                    n.setMarked(true);
                    stack.push(n);
                }
            }
            visit(r);
        }

    }

    public void bfs(){
        bfs(0);
    }

    private void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        root.setMarked(true);
        while (!queue.isEmpty()){
            Node r = queue.poll();
            for(Node n : r.getAdjacent()){
                if(!n.isMarked()){
                    n.setMarked(true);
                    queue.offer(n);
                }
            }
            visit(r);
        }
    }

    public void dfsR(Node r){
        if(r == null) return;
        r.setMarked(true);
        visit(r);
        for (Node n : r.getAdjacent()){
            if(!n.isMarked()){
                dfsR(n);
            }
        }
    }

    private void dfsR(int index) {
        Node r = nodes[index];
        dfsR(r);
    }

    public void dfsR(){
        dfsR(0);
    }


    private void visit(Node r) {
        System.out.println("visted node : " + r.getData() );
    }


}

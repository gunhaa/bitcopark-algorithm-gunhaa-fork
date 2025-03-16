package mynote.graph.dfs_bfs;

import java.util.LinkedList;

public class Node {

    private int data;
    private LinkedList<Node> adjacent;
    private boolean marked;

    public Node(int data) {
        this.data = data;
        this.marked = false;
        this.adjacent = new LinkedList<Node>();
    }

    public boolean isMarked() {
        return marked;
    }

    public LinkedList<Node> getAdjacent() {
        return adjacent;
    }

    public int getData() {
        return data;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }
}

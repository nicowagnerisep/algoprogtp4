import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GraphAdjList {

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Integer>> getAdj() {
        return adj;
    }

    public void setAdj(List<List<Integer>> adj) {
        this.adj = adj;
    }

    private int order;
    private int size;
    private List<List<Integer>> adj;

    public GraphAdjList(int order, int size, List<List<Integer>> adj) {
        this.order = order;
        this.size = size;
        this.adj = adj;
    }

    public GraphAdjList() {
        this.order = 0;
        this.size = 0;
    }

    public GraphAdjList(int order, int size) {
        this.order = order;
        this.size = size;
    }

}


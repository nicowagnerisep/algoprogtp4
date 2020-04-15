import java.util.ArrayList;
import java.util.List;

public class Node {

    public int getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(int nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    public List<Edge> getListEdges() {
        return listEdges;
    }

    public void setListEdges(List<Edge> listEdges) {
        this.listEdges = listEdges;
    }

    public List<Node> getNeighbors() {
        return Neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        Neighbors = neighbors;
    }

    private int nodeNumber;
    private List<Edge> listEdges;
    private List<Node> Neighbors;

    public Node(int number){
        this.nodeNumber = number;
    }

    public Node(int number, List<Edge> edges){
        this.nodeNumber = number;
        this.listEdges = new ArrayList<>();
        getEdgesFromList(edges);
    }



    public void printNode(){
        System.out.println("("+this.getNodeNumber()+")");
        System.out.println("Edges : " );
        for (Edge edge : getListEdges()){
            edge.printEdge();
        }
    }

    public void getEdgesFromList(List<Edge> edges){
        List<Edge> newList= getListEdges();

        for (Edge edge : edges){
            if (edge.getFirstVert()==this.getNodeNumber()){
                newList.add(edge);
                setListEdges(newList);
            }
        }
    }
}



import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {


        Graph test = new Graph();
        ArrayList<Edge> listEdges= test.getEdgesFromInput();
        for (Edge edge : listEdges){
            edge.printEdge();
        }


        List<Node> nodes= test.createNodeListFromListInput();


        for (Node node : nodes){
            node.printNode();
        }






    }
}

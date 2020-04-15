import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Graph extends GraphAdjList {

    public GraphAdjList createEmptyGraph() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter order N: ");
        int orderEmpty = in.nextInt();
        GraphAdjList emptyGraph = new GraphAdjList(orderEmpty, 0);
        return emptyGraph;

    }

    public ArrayList<Integer> getIntListFromInputStream() {
        ArrayList<Integer> listIntFile = new ArrayList<>();

        try {
            File file = new File("./graph.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextInt()) {
                listIntFile.add(scan.nextInt());
            }
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erreur");
            e.printStackTrace();


        }
        return listIntFile;
    }

    public ArrayList<Edge> getEdgesFromInput() {
        ArrayList<Integer> listInt = this.getIntListFromInputStream();
        ArrayList<Edge> listEdge = new ArrayList<>();
        for (int i = 0; i < listInt.size(); i += 2) {
            Edge edge = new Edge(listInt.get(i), listInt.get(i + 1));
            listEdge.add(edge);
        }
        return listEdge;
    }

    public List<Node> createNodeListFromListInput() {
        List<Node> listNodes = new ArrayList<>();


        List<Integer> listInput = this.getIntListFromInputStream();
        List<Edge> listEdges = this.getEdgesFromInput();

        Set<Integer> setInput = new TreeSet<>();
        setInput.addAll(listInput);

        for (int i : setInput) {
            Node node = new Node(i,listEdges);
            listNodes.add(node);





        }
        return listNodes;
    }
}

public class Edge {

    public Edge(int firstVert, int secondVert) {
        this.firstVert = firstVert;
        this.secondVert = secondVert;
    }

    public int getFirstVert() {
        return firstVert;
    }

    public void setFirstVert(int firstVert) {
        this.firstVert = firstVert;
    }

    public int getSecondVert() {
        return secondVert;
    }

    public void setSecondVert(int secondVert) {
        this.secondVert = secondVert;
    }

    private int firstVert;
    private int secondVert;


    public void printEdge(){
        System.out.println(getFirstVert() + " --- "+ getSecondVert());
    }

}

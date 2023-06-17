public class Graph {
    public static void main(String[] args){
        GraphClass mygc=new GraphClass();
        mygc.addvertex("A");
        mygc.addvertex("B");
        mygc.addvertex("C");
        mygc.addedge("A", "B");
        mygc.addedge("A","C");
        // mygc.removeedge("A", "B");
        mygc.printmap();
    }
}

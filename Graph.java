public class Graph {
    public static void main(String[] args){
        GraphClass mygc=new GraphClass();
        mygc.addvertex("A");
        mygc.addvertex("B");
        mygc.addvertex("C");
        mygc.addvertex("D");
        mygc.addedge("A", "B");
        mygc.addedge("A","C");
        mygc.addedge("A","D");
        mygc.addedge("B","D");
        mygc.addedge("C","D");
        mygc.removevertex("D");
        // mygc.removeedge("A", "B");
        mygc.printmap();
    }
 }

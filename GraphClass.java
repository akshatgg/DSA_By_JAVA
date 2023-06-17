import java.util.ArrayList;
import java.util.HashMap;

public class GraphClass {
    private HashMap<String,ArrayList<String>> myhp=new HashMap<>();
    public void printmap(){
        System.out.println(myhp);
    }
    public Boolean addvertex(String vertex ){
       if(myhp.get(vertex)==null){
        myhp.put(vertex,new ArrayList<>());
        return true;
       }
return false;
    }
    
}

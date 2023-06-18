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
    public Boolean addedge(String v1,String v2){
if(myhp.get(v1)!=null && myhp.get(v2)!=null){
    myhp.get(v1).add(v2);
    myhp.get(v2).add(v1);
    return true;
}
return false;
    }
    public Boolean removeedge(String v1,String v2){
        if(myhp.get(v1)!=null && myhp.get(v2)!=null){
            myhp.get(v1).remove(v2);
            myhp.get(v2).remove(v1);
            return true;
        }
        return false;
    }
    public Boolean removevertex(String vertex){
    if(myhp.get(vertex)==null){
        return false;
    }
    for(String v3:myhp.get(vertex)){
myhp.get(v3).remove(vertex);
    }
    myhp.remove(vertex);
    return true;
    }
}

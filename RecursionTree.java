import java.util.*;
public class RecursionTree{
    public static void main(String[] args){
    RecursionTreeClass rc=new RecursionTreeClass();
    rc.insert(2);
    rc.insert(1);
    rc.insert(3);
    
    System.out.println(rc.root.left.data);
    }

}
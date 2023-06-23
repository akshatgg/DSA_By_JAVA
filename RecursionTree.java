import java.util.*;
import javax.print.event.PrintJobListener;
public class RecursionTree{
    public static void main(String[] args){
    RecursionTreeClass rc=new RecursionTreeClass();
    rc.insert(2);
    rc.insert(1);
    rc.insert(3);
    rc.contains(2);
    //   rc.delete(1);
    //   System.out.println(rc.contains(1));
    // System.out.println(rc.root.left.data);
       System.out.println(rc.root.data);
    }
}

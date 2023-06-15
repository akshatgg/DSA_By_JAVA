import java.util.ArrayList;
import java.util.HashMap;
public class itemcommon {
public static Boolean itemInCommon(int[] array1,int[] array2){
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int el:array1){
        for(int al:array2){
            if(el==al){
                return true;
            }
        }
    }
    return false;
}
    // WRITE THE ITEMINCOMMON METHOD HERE //
    //                                    //
    //                                    //
    //                                    //
    //                                    //
    ////////////////////////////////////////
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        System.out.println(itemInCommon(array1, array2));
        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */
    }



}

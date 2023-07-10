import java.util.*;


public class findPairs {
public static List<int[]>findPairs(int[] A,int[] B,int t){
List<int[]> list=new ArrayList<>();
for(int a: A){
    for(int b:B){
        if(a+b==t){
      int[] pair= {a,b};
      list.add(pair);
        }
    }
}
return list;
}
    // WRITE FINDPAIRS METHOD HERE // 
    //                             //
    //                             // 
    //                             //
    //                             //
    /////////////////////////////////


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */
        
    }
    
}

    
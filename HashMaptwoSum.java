import java.util.*;
public class HashMaptwoSum {
public static Integer[] twoSum(int[] A,int target){
    Integer[] arr=new Integer[2];
    for(int i=1;i<A.length;i++){
        int sum =0;
        sum=A[i]+A[i-1];
        if(sum==target){
            int j=0;
            arr[j]=i-1;
            arr[j+1]=i; 
            
            return arr;
}
}
return new Integer[0];
}

    
    
    // WRITE THE TWOSUM MEHTOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */
        
    }
}



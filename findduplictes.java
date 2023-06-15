import java.util.*;
public class findduplictes {
    public static int findDuplicates(int[] nums){
HashMap<Integer,Integer> myhp=new HashMap<>();
int count=0;
for(int e:nums){
  if(myhp.containsKey(e)){
count++;
  }
}



    }
    // WRITE THE FINDDUPLICATES METHOD HERE // 
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////
      

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */
        
    }



    
}

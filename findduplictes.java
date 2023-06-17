import java.util.*;
public class findduplictes {
    public static Set<Integer> findDuplicates(int[] nums){
HashMap<Integer,Integer> myhp=new HashMap<>();
for(int e:nums){
  int count=0;
  for(int m:nums){
    if(e==m){
      count++;
    }
  }
  if(count>=2){
    myhp.put(e,count);
  }
//   if(myhp.containsKey(e)){
// count++;
  }
return myhp.keySet();
}

    // WRITE THE FINDDUPLICATES METHOD HERE // 
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////
      

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        Set<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */
        
    }



    
}

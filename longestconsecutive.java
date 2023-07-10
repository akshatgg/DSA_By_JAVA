import java.util.ArrayList;
import java.util.*;
public class longestconsecutive {
public static Integer longestConsecutiveSequence(int[] n){
    int length=1;
    ArrayList<Integer> list=new ArrayList<>();
for(int i:n){
    for(int j=0;j<n.length;j++){
    if(i+1==n[j]){
        i=i+1;
        length++;
        j=0;
    }
}
list.add(length);
length=1;
}

return Collections.max(list);
}

 
    // WRITE LONGESTCONSECUTIVESEQUENCE METOHOD HERE //
    //                                               //
    //                                               //
    //                                               //
    //                                               //
    ///////////////////////////////////////////////////


    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int longest = longestConsecutiveSequence(nums);
        System.out.println(longest);

        /*
            EXPECTED OUTPUT:
            ----------------
            4
            
        */
        
    }
    
}



import java.util.*;
public class nonrepeating {
public static Character firstNonRepeatingChar(String s){
    HashMap<Character,Integer> myhp=new HashMap<>();
char[] c=s.toCharArray();
for(char e: c){
    myhp.put(e,myhp.getOrDefault(e, 0)+1);
}
   for(char e:c){
    if(myhp.get(e)==1){
    return e;
    }
   }
   return null;
}


    
    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    //                                         //
    //                                         //
    //                                         //
    //                                         //
    /////////////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */
        
    }
    
}


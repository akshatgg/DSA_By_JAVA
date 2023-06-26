import java.util.HashSet;
import java.util.Set;
public class UniqueChars {
    public static boolean hasUniqueChars(String s){
     char[] c=s.toCharArray();
        HashSet<Character> myhp=new HashSet<>();
        for(char e:c){
        myhp.add(e);
        }
        for(char e:c){
            for(char l:c){
                if(e==l){
                return true;
                }
            }
        }
        return false;
    }
    // WRITE HASUNIQUECHARS METHOD HERE //
    //                                  //
    //                                  //
    //                                  //
    //                                  //
    //////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false
        
        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
            
        */
        
    }
    
}

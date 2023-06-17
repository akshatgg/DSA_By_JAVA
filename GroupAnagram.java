import java.util.*;
public class GroupAnagram {
public static List<List< String>> groupAnagrams(String[] s){
    HashMap<String,List<String>> myhp=new HashMap<>();
    for(String e:s){
        char[] c=e.toCharArray();
       Arrays.sort(c);
       String str=String.valueOf(c);
 if(!myhp.containsKey(str)){
    myhp.put(str,new ArrayList<>());
 }
 myhp.get(str).add(e);
    }
    return new ArrayList<>(myhp.values());

}
    // WRITE GROUPANAGRAMS METHOD HERE // 
    //                                 //s
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */
        
    }
    


}

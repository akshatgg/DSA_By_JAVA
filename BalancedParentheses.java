public class BalancedParentheses {
    public static boolean isBalancedParentheses(String s) 
    {
        BalancedParenthesesClass<Character> chars =new BalancedParenthesesClass<>();
        char[] c=s.toCharArray();
        int count1=0;
        int count2=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==')'){
                count1++;
            }
            else if(c[i]=='('){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
    }
        // WRITE THE ISBALANCEDPARENTHESES METHOD HERE //
    //                                             //
    //                                             //
    //                                             //
    //                                             //
    /////////////////////////////////////////////////


    public static void main(String[] args) {
        String s1 = "()()()";
        String s2 = "()(()";
        String s3 = "(()())";
        System.out.println(isBalancedParentheses(s1)); // true
        System.out.println(isBalancedParentheses(s2)); // false
        System.out.println(isBalancedParentheses(s3)); // true
        
        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
        */
    
}
}

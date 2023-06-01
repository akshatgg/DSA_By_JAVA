public class StackReverseString {
public static String reverseString(String myString) {
StackReverseStringClass<Character> s = new StackReverseStringClass<>();
char[] chars=myString.toCharArray();
for(char c:chars){
    s.push(c);
}
for(int i=0;i<myString.length();i++){
    chars[i]=s.pop();
    
}
return new String(chars);
}

        // WRITE THE REVERSESTRING METHOD HERE //
        //                                     //
        //                                     //
        //                                     //
        //                                     //
        /////////////////////////////////////////
        
       
    
        public static void main(String[] args) {
    
            String myString = "hello";
           
            String reversedString = reverseString(myString);
            System.out.println(reversedString);
            /*
                EXPECTED OUTPUT:
                ----------------
                olleh
            */
    
        
    
    }
}


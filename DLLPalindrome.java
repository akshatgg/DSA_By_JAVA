public class DLLPalindrome {
    

        public static void main(String[] args) {
    
            DLLPalindromeClass myDLL1 = new DLLPalindromeClass(1);
            myDLL1.append(2);
            myDLL1.append(3);
            myDLL1.append(2);
            myDLL1.append(1);
            
            System.out.println("myDLL1 isPalindrome:");
            System.out.println( myDLL1.isPalindrome() );
            
            
            
            DLLPalindromeClass myDLL2 = new DLLPalindromeClass(1);
            myDLL2.append(2);
            myDLL2.append(3);
            
            System.out.println("\nmyDLL2 isPalindrome:");
            System.out.println( myDLL2.isPalindrome() );
            
            
            
            /*
                   EXPECTED OUTPUT:
                ----------------
                DLL before swap:
                1
                2
                3
                4
                5
                
                DLL after swap:
                5
                2
                3
                4
                1
            
             */
    
        }
        
    }
}

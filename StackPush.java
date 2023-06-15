public class StackPush {
        
        public static void main(String[] args) {
    
            StackPushClass myStack = new StackPushClass();
            
            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            
            myStack.printStack();
            
            /*
                EXPECTED OUTPUT:
                3
                2 
                1
    
            */
    
        }
    
    }


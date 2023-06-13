
    import java.util.Stack;

public class queueClass {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public queueClass() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
     public int enqueue(int n){
          stack1.push(n);
          while(stack1 !=null){
          stack2.push((stack1.pop()));
    
     
        }
        return stack2.peek();
        }
    // WRITE THE ENQUEUE METHOD HERE //
    //                               //
    //                               //
    //                               //
    //                               //
    ///////////////////////////////////
    
    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}



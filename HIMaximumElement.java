import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */
        
    public static List<Integer> getMax(List<String> operations) {
        List<Integer> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> maxstack=new Stack<>();
        
        
        for(String operation:operations){
            String[] order=operation.split(" ");
            int type=Integer.parseInt(order[0]);
            if(type==1){
                int x=Integer.parseInt(order[1]);
                stack.push(x);
                if(maxstack.isEmpty() || x>maxstack.peek()){
                 maxstack.push(x);
                }
            }
            else if(type==2){
                
                int x=stack.pop();
                if(x==maxstack.peek()){
                    maxstack.pop();
                }
            }
            else if(type==3){
                list.add(maxstack.peek());
            }
        }
        return list;
        // Write your code here
        
    }
    
}


    public class HIMaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String opsItem = bufferedReader.readLine();
            ops.add(opsItem);
        }
        List<Integer> res = Result.getMax(ops);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }
         
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}




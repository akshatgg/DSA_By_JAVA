import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    /*
    * Complete the 'twoStacks' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    *  1. INTEGER maxSum
    *  2. INTEGER_ARRAY a
    *  3. INTEGER_ARRAY b
     */
    
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s2=new Stack<>();
      
        int sum2=0,count=0;
        
        for(int i=(a.size()-1);i>=0;i--){
            s.add(a.get(i));
        }
        for(int i=(b.size()-1);i>=0;i--){
            s2.add(b.get(i));
        }
        while(maxSum>sum2){
            
            if(s.peek()>s2.peek()){
                if(sum2+s2.peek()<maxSum){
                    sum2=sum2+s2.pop();
                    count++;
                }
                else{
                    break;
                }
            }
            else if(s.peek()<s2.peek()){
                if(sum2+s.peek()<maxSum){
                    sum2=sum2+s.pop();
                    count++;
                }
                else{
                    break;
                }
                
            }
        }
        return count;
        
    }
    
}

public class HIGameoftwoStacks {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int m = Integer.parseInt(firstMultipleInput[1]);

            int maxSum = Integer.parseInt(firstMultipleInput[2]);

            String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aTemp[i]);
                a.add(aItem);
            }

            String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> b = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                int bItem = Integer.parseInt(bTemp[i]);
                b.add(bItem);
            }

            int result = Result.twoStacks(maxSum, a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}



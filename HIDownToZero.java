import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {
    
    /*
    * Complete the 'downToZero' function belo w.
    *
    * The function is expected to return an INTEGER.
    * The function accepts INTEGER n as parameter.
    */
    
    public static int downToZero(int n) {
        // Write your code here
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=n;i>=0;i--){
            count++;
        }
        list.add(count);
        return Collections.min(list);
        
    }
    
}

public class HIDownToZero {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.downToZero(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}



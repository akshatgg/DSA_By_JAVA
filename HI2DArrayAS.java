import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    
    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    
     int sum1 = Integer.MIN_VALUE;
     
     for(int j=0;j<4;j++){
         
         for(int i=0;i<=3;i++){
             
             int sum=arr.get(j).get(i)+arr.get(j).get(i+1)+arr.get(j).get(i+2)+arr.get(j+1).get(i+1)+arr.get(j+2).get(i)+arr.get(j+2).get(i+1)+arr.get(j+2).get(i+2);
    if(sum>sum1){
        sum1=sum;
    }
}

}
            return sum1;
    }
}

public class HI2DArrayAS {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}



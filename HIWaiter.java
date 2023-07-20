import java.io.*;
import java.util.*;



class Result {

    /*
    * Complete the 'waiter' function below.
    *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */
    

    public static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> A=new ArrayList<>();
        List<Integer> B=new ArrayList<>();
        List<Integer> C=new ArrayList<>();
        C.addAll(number);
        int i=1;
        int o=0;
        while(o!=q){
            int count=0;
            A.clear();
            B.clear();
            while(count!=2){
                count=0;
            i++;
        for(int j=1;j<=i;j++){
            if(i%j==0){
            count++;
            }
        }
    }
    for(int k=0;k<C.size();k++){
        if(C.get(k)%i!=0){
          A.add(C.get(k));
        }
        else{
            B.add(C.get(k));
        }
    }
    o++;
    C.clear();
    C.addAll(A);

        
        
    }
    B.addAll(A);
        return B;
    }
    
}

public class HIWaiter {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        String[] numberTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int numberItem = Integer.parseInt(numberTemp[i]);
            number.add(numberItem);
        }

        List<Integer> result = Result.waiter(number, q);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    
    /*
    * Complete the 'matchingStrings' function below.
    *
    * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */
    
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> list=new ArrayList<>();
        int count;
        for(int i=0;i<queries.size();i++){
            count =0;
            for(int j=0;j<stringList.size();j++){
                if(queries.get(i).equals(stringList.get(j))){
                    count++;
                }
            }
            list.add(count);
        }
        // Write your code here
        return list;
    }
    
}

public class HISpraseArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < stringListCount; i++) {
            String stringListItem = bufferedReader.readLine();
            stringList.add(stringListItem);
        }

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = bufferedReader.readLine();
            queries.add(queriesItem);
        }

        List<Integer> res = Result.matchingStrings(stringList, queries);

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



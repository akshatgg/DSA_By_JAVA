import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class  HIEqualStacks {
 


    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */
public static int calculatesum(List<Integer> h){
    int sum=0;
    for(int e:h){
        sum=sum+e;
    }
    return sum;
}
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    // Write your code here
    int sum1=calculatesum(h1);
     int sum2=calculatesum(h2);
     int sum3=calculatesum(h3);
    while(sum1!=sum2 && sum2!=sum3){
       if(sum1>sum2 && sum1>sum3){
        int h=h1.remove(0);
        sum1=sum1-h;
       }
       else if(sum1<sum2){
            int e=h2.remove(0);
            sum2=sum2-e;
        }
        else if(sum1<sum3){
            int r=h3.remove(0);
            sum3=sum3-r;
        }
    }
    return sum2;
    }



    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
    List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
            List<Integer> h3 = new ArrayList<>();
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            for(int i=0;i<n1;i++){
               int e=sc.nextInt();
                h1.add(e);
            }
              for(int i=0;i<n2;i++){
               int e=sc.nextInt();
                h2.add(e);
            }
              for(int i=0;i<n3;i++){
               int e=sc.nextInt();
                h3.add(e);
            }
        System.out.println(equalStacks(h1,h2,h3));




        }
    }



   

  


  

import java.util.HashMap;

public class interviewQ {
    public static boolean itemcommon(int[] A,int[] B){
        HashMap<Integer,Boolean> myhash=new HashMap<>();
        for(int i:A){
myhash.put(i, true);
        }
        for(int j:B){
            if(myhash.get(j)!=null)return true;
        }
        return false;
    }
    public static void main(String []args){
        int[] A={1,2,4};
        int[] B={5,6,4};
        System.out.println(itemcommon(A,B));
    }
}

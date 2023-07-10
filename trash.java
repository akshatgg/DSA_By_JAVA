//int[] nums=[1,2,1]
//output=[1,2,1,1,2,1]

import java.util.Arrays;

public class trash {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 1 };
        
        System.out.println(Arrays.toString(Concatenation(nums)));

    }

    public static int[] Concatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
            // upto i=2 array will be printed [1,2,1]
            // after that ans[i+n]=0+3=3=>nums[i]=nums[0]=1
            // so at third index 1 will be printed
            // ans[i] and ans[i+n] will be filled equally like first new array's index
            // first will be filled with element 1 and the ans[i+n]=array's 0+3=3rd index
            // will be filled 1
            // System.out.println(ans[i]);
        }
        return ans;
    }
}


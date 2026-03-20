import java.util.Arrays;

public class PartitionEquallySubsetSum {
    public static void main(String[] a){
        int[] nums =new int[] {3,3,6,8,16,16,16,18,20};//3,3,6,8,16,16,16,18,20
        int total = 0;
        for (int num : nums) total += num;


        if (total % 2 != 0) System.out.println(false);

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num]) {
                    dp[i] = true;
                }
            }
        }


        System.out.println(dp[target]);
       // System.out.println(result);
    }
}

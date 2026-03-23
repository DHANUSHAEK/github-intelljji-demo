import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        for (int first = 0; first < nums.length - 1; first++) {
            for (int second = first + 1; second < nums.length; second++) {
                if (nums[first] > nums[second]) {
                    int temp = nums[first];
                    nums[first] = nums[second];
                    nums[second] = temp;
                }
            }
        }
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        List<Integer> list = new ArrayList<>();
        int maxindex = 0;
        for (int first = 1; first < nums.length; first++) {
            for (int second = 0; second <first; second++) {
                if (nums[first] % nums[second] == 0 && dp[second] + 1 > dp[first]) {
                    dp[first] = dp[second] + 1;
                    prev[first] = second;
                }

            }
            if (dp[first] > dp[maxindex]) {
                maxindex = first;
            }
        }
        while (maxindex != -1) {
            list.add(nums[maxindex]);
            maxindex = prev[maxindex];
        }
        System.out.println(list);
    }
}
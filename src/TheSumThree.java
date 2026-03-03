import java.util.*;
public class TheSumThree {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,0};//-1, 2, 1, -4
        Arrays.sort(nums);
        int target = 1;
        int result=0;
        int n = nums.length;
        int minval=-1;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff=Math.abs(target-sum);

                if(diff<minval || minval==-1){
                    minval=diff;
                    result=sum;
                }
               // if (diff<target|| diff>target) {
                  //  System.out.print(sum);
                  //  break;
               // }
                   // while (left < right && nums[left] == nums[left + 1]) left++;
                   // while (left < right && nums[right] == nums[right - 1]) right--;
                   // left++;
                   // right--;
                 else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.print(result);
    }
}

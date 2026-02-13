import java.util.Arrays;
public class TwoSum11 {
    public static void main(String [] a){
        int[] nums={2,4,7,8};
        int target=13;
       System.out.println(Arrays.toString(findSum(nums,target)));
    }
    static int [] findSum(int[] nums,int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=0;
            sum=nums[left]+nums[right];
            if(sum==target){
                return new int [] {nums[left],nums[right]};
            }
            if(sum<target){
                left++;
            }
            if(sum>target){
                right--;
            }
        }
        return new int[]{};
    }
}

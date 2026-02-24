import java.util.Arrays;
public class TwoSum11 {
    public static void main(String [] a){
        int[] nums={2,4,7,8};
        int target=9;
        int[] result =findSum(nums,target);
        System.out.println(Arrays.toString(result));
        for(int loop=0;loop<result.length;loop++ ){
        System.out.print(result[loop]);
    }}
    static int [] findSum(int[] nums,int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=0;
            sum=nums[left]+nums[right];
            if(sum==target){
                return new int [] {left,right};
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
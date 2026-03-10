import java.util.Arrays;
public class MinimumCostBuyingCandiesWithDiscount {
    public static void main(String[] args){
        int[] nums=new int[]{1,2,3};
        for(int start=0;start<nums.length-1;start++){
            for(int inner=start+1;inner<nums.length;inner++){
                if(nums[start]<nums[inner]){
                    int temp=nums[start];
                    nums[start]=nums[inner];
                    nums[inner]=temp;
                }
            }
        }
        int total=0;
        total=nums[0]+nums[1];
        for(int start=2;start<nums.length;start++){
            if(nums[start]<nums[start-1]){

            }
        }

        System.out.print(Arrays.toString(nums));
    }
}

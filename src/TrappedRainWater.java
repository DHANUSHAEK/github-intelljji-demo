public class TrappedRainWater {
    public static void main(String[] args){
        int[] nums={1,0,3,0,2,0,3};
        int left=0;
        int right=nums.length-1;
        int leftM=0,rightM=0;
        int water=0;
        while(left<right){
            if(nums[left]<=nums[right]){
                if(nums[left]>=leftM){
                    leftM=nums[left];
                }
                else{
                    water+=leftM-nums[left];
                }
                left++;
            }
            else{
                if(nums[right]>=rightM){
                    rightM=nums[right];
                }
                else {
                    water+=rightM-nums[right];
                }
                right--;
            }

        }
        System.out.println(water);
    }
}

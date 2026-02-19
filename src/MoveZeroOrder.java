public class MoveZeroOrder {
    public static void main(String[] args){
        int[] nums=new int[]{1,0,1,0,0,0,1,2,3,0,1};
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }

        }
        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
}

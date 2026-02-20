public class MaximumOnes111 {
    public static void main(String[] args){
        int[] nums=new int[]{1,0,0,1};
        int left=0,max_value=0,zero=0,k=2;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=1){
                zero++;
            }
            while(zero>k){
                if(nums[left]!=1){
                    zero--;
                }
                left++;
            }
            if(right-left+1>max_value){
                max_value=right-left+1;
            }
        }
        System.out.println(max_value);
    }
}

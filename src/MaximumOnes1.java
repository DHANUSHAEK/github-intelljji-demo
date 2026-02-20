public class MaximumOnes1 {
public static void main(String[] args){
    int[] nums=new int[]{1,0,1,1,0,1};
    int max_value=0;
    int count=0;
    for(int right=0;right<nums.length;right++){
        if(nums[right]==1){
            count++;
        }
        if(count>max_value) {
            max_value = count;
        }
        if(nums[right]!=1){
            count=0;
        }
    }
    System.out.println(max_value);
}
}

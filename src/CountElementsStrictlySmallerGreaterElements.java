import java.util.Arrays;
public class CountElementsStrictlySmallerGreaterElements {
public static void main(String[] args){
    int[] nums=new int[]{11,7,2,15};
    Arrays.sort(nums);
    int left=nums[0];
    int right=nums[nums.length-1];
    int count=0;
    for(int start=0;start<nums.length;start++){
        if(nums[start]>left && nums[start]<right){
            count++;
        }
    }
    System.out.println(count);
}

}

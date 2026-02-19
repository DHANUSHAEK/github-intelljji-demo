import java.util.*;
public class RemoveDuplicates {
public static void main(String[] args){
    int[] nums={1,1,2,3,4,1,4,2,3,5,7,8,0,0,0,3};
    Arrays.sort(nums);
    int left=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[left++]=nums[i];
        }
    }
    for(int i=0;i<left;i++) {
        System.out.println(nums[i]);
    }
}
}

public class ContainerMostWater{
public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,4,5,-1};

    System.out.println(containerWater(nums));
}
    static int containerWater(int [] nums){
        int left=0,right=nums.length-1;
        int max_val=0;
while(left<right) {
    int height;
    int width;
    if (nums[left] < nums[right]) {
        height = nums[left];
    } else {
        height= nums[right];
    }
    width = right - left;
    int most = height * width;
    if (most > max_val) {
        max_val = most;
    }
    if (nums[left] < nums[right]) {

        left++;
    } else if (nums[left] > nums[right]) {

        right--;
    } else {

        right--;
    }
}



return max_val;
    }
}

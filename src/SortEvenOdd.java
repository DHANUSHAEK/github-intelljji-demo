import java.util.Arrays;
public class SortEvenOdd {
    public static void main(String[] args) {
        int[] nums = new int[]{36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};//4,1,2,3
        for (int j = 0; j < nums.length; j++) {
            if(j%2==0){
            for (int i = 0; i < nums.length ; i++) {
                if(i%2==0) {
                    if (nums[j] < nums[i]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            }
            else{
                for (int i = 0; i < nums.length ; i++) {
                    if (i % 2 != 0) {
                        if (nums[j] > nums[i]) {
                            int swap = nums[i];
                            nums[i] = nums[j];
                            nums[j] = swap;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
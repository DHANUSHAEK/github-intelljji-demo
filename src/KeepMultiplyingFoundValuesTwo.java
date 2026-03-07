import java.util.Arrays;
public class KeepMultiplyingFoundValuesTwo {
    public static void main(String[] args) {
        int[] nums=new int[]{8,19,4,2,15,3};
        Arrays.sort(nums);
        int original=2;
        int value=0;
        for(int start=0;start< nums.length;start++){

        if(nums[start]==original){
            value=2*nums[start];
        }
        else if(value==nums[start]){
            value=2*value;
        }
        }
        if(value>0) {

            System.out.print(value);
        }
        else{
            System.out.print(original);
        }
    }
}

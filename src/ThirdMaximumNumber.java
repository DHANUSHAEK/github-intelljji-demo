import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] a){
        int[] nums = new int[]{3,2,2,};
        for(int first=0;first<nums.length-1;first++){
            for (int second=first+1;second<nums.length;second++){
                if(nums[first]<nums[second]){
                    int temp=nums[first];
                    nums[first]=nums[second];
                    nums[second]=temp;
                }
            }
        }
        int count=2;
        int max_value=nums[0];
        int prev=max_value;
        for(int loop=1;loop<nums.length;loop++){
            if(nums[loop]!=prev){
                prev=nums[loop];
                count--;
            }
            if(count==0){
                prev=nums[loop];
                break;
            }
        }
        if(count==0){
            System.out.println(prev);
        }
        else{
           System.out.println(max_value);
        }
    }
}

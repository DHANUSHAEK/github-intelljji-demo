import java.util.Arrays;
public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
int[] nums={17,18,5,4,6,1};
int[] result=new int[nums.length];

for(int check=0;check<nums.length;check++){
    int right=Integer.MIN_VALUE;
    for(int traverse=check+1;traverse<nums.length;traverse++){
        if(nums[traverse]>=right){
            right=nums[traverse];
        }
    }
    result[check]=right;
}
result[nums.length-1]=-1;
System.out.println(Arrays.toString(result));
    }
}


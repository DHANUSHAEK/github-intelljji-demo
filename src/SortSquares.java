import java.util.Arrays;

public class SortSquares {
    static int [] sortSquares(int [] nums) {
        int []array=new int[nums.length];
    int left=0,right=nums.length-1;
    int pos=nums.length-1;
    while (left<=right){
        int leftSquare=nums[left]*nums[left];
        int rightSquare=nums[right]*nums[right];
        if(leftSquare>rightSquare){
            array[pos]=leftSquare;
            left++;
        }
        else{
            array[pos]=rightSquare;
            right--;
        }
        pos--;
    }
    return array;
    }
    public static void main(String[] a){
        int []nums={-7,-8,1,4,11};
        System.out.println(Arrays.toString(sortSquares(nums)));
    }

}

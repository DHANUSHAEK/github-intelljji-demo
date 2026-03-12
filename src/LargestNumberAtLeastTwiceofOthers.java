 import java.util.*;
    public class LargestNumberAtLeastTwiceofOthers {
        public static void main(String[] args) {
            int[] nums = new int[]{3,6,1,0};
            int left=0;
            int right=nums.length-1;
            int First_Largest=0;
            int Second_Largest=0;
            int index=-1;
            while(left<right) {
                if (nums[left] >= nums[right]) {
                    First_Largest = nums[left];
                    index = left;
                    if (nums[right] >=Second_Largest) {
                        Second_Largest = nums[right];
                    }
                    right--;
                } else if (nums[right] >nums[left]) {
                    First_Largest = nums[right];
                    index = right;
                    if (nums[left] >= Second_Largest) {
                        Second_Largest = nums[left];
                    }
                    left++;
                }

            }
            System.out.println(First_Largest);
            System.out.println(Second_Largest);
            if( First_Largest/2>= Second_Largest){
                System.out.println(index);
            }
            else{
                System.out.println(-1);
            }
        }
    }


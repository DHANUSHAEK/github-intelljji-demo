import java.util.*;
public class ThreeSumUnique {
    public static void main(String[] a) {
        int[] nums = {-4, -1, -1, 0, 1, 2};
        int target = 0;
        List<List<Integer>> triplets = ThreeSum(  nums,target);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
    static List<List<Integer>> ThreeSum(int[]nums,int target){
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1]) left++;
                    while(left<right&&nums[right]==nums[right-1]) right--;
                left++;right--;
                } else if (sum<target) {
                    left++;
                }
                    else{
                        right--;
                    }

            }

        }
        return result;

        }
    }


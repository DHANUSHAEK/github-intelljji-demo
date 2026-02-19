public class MInimumSubaArray {
public static void main(String[] args){
    int[] nums=new int[]{1,2,3,4,5};
    int target=11;
    int count=0;
    int minsize=99999;
    int size=0;
    int left=0;

    for(int right=0;right<nums.length;right++){
            count+=nums[right];
        while(count>=target){
            if(right-left+1<minsize){
                minsize=right-left+1;
            }

            count-=nums[left];

            left++;
        }

    }
System.out.println(minsize);
}
}

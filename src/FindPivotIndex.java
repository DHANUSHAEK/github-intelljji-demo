public class FindPivotIndex {
    public static void main(String[] args){
        int[] nums = new int[]{1,7,3,6,5,6};
        int total=0;
        int leftside=0;
        for(int start=0;start<nums.length;start++){
            total+=nums[start];
        }
        for(int left=0;left<nums.length;left++) {
           System.out.println(left);
          //  System.out.println(total);
            int rightside = total - leftside - nums[left];
            if (leftside == rightside) {
                System.out.println(left);
            }
            leftside += nums[left];
            System.out.print(leftside);
        }
            System.out.print(-1);

    }

}

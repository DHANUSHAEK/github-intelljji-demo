public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();

        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int length = obj.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + length);

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,9,5,4,1,2};
        int max_value = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];
                index = i;
            }
        }
        int left = index - 1;
        int right = index + 1;
        boolean result1 = false;
        boolean result2=false;
        while (left!=-1 || right !=arr.length) {
            if (left > -1 && arr[left] < arr[left +1] ) {
                result1=true;
                left--;
            } else if(left>-1){
                result1 = false;
                break;
            }
            if (right < arr.length && arr[right] < arr[right - 1]  ) {
                result2=true;
                right++;
            } else if(right<arr.length){
                result2 = false;
                break;
            }

        }
        if(result1!=result2){
            System.out.println(false);
        }
        else{
            System.out.println(result1);
        }
    }
}

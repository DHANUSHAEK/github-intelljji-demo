import java.util.Arrays;
class MinimumSumFourDigitSplit{
    public static void main(String[] args) {
int num=4123;
String s=Integer.toString(num);
int[] nums=new int[s.length()];
int count=0;
while(num>0){
    int temp=num%10;
    nums[count]=temp;
    num=num/10;
    count++;
}
Arrays.sort(nums);
int num1=0;
int num2=0;
        for(int start=0;start<nums.length;start++) {
        if(start%2==0) {
num1 = num1 * 10 + (nums[start]);
        }
        else{
num2 = num2 * 10 + (nums[start]);
        }
        }
    System.out.println( num1+num2);
    }
            }


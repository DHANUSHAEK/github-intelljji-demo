import java.math.BigInteger;
public class AddString {
    public static void main(String[] a){
        String num1 = "6913259244" ,num2 = "71103343";
        BigInteger num=new BigInteger(num1);
        BigInteger nums=new BigInteger(num2);
        BigInteger sum=num.add(nums);
        System.out.println(sum.toString());

    }
}

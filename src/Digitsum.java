//5. Develop a Java program to the sum of the digits of a number?
import java.util.Scanner;
public class Digitsum {
    public static void main(String[] args){
       int n=123;
       System.out.println(Digit(n));
    }
    static int Digit(int n){
        if(n==0) return 0;
        return n%10+Digit(n/10);
    }
}

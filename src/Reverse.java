//6. Develop a Java program to reverse a string without using string inbuilt function?
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(rever(n));
    }
    static String rever(String n){
        if(n=="") return n;
        return rever(n.substring(1))+n.charAt(0);
    }
}

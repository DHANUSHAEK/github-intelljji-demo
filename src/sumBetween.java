//4. Develop a Java program to find the sum between 'n' and 'm'?
import java.util.Scanner;
public class sumBetween {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(SumBet(n,m));
        sc.close();
    }
    static int SumBet(int n,int m){
        if(n>m) return 0;
        return m+SumBet(n,m-1);
    }
}

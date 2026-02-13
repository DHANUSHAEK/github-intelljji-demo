//2. Develop a Java program to countDown(int n) the given number?



import java.util.*;
public class count {
    static void countdown(int n){
        if(n==0) return ;
        System.out.println(n);
        countdown(n-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         countdown(n);
         sc.close();
    }
}

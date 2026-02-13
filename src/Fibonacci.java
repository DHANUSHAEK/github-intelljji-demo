//7. Develop a Java program to find the fibonacci series of 'n' terms?
public class Fibonacci {
    public static void main(String[] a){
        int n=10;
       System.out.println(fibo(n));
    }
    static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}

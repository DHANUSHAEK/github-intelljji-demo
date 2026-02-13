//1. Develop a Java program to print the numbers from 1 to 'n'.

public class Numbers {
    static void number(int n){
        if(n==0) return;
        number(n-1);
        System.out.println(n);
    }

public static void main(String[] args){
  int n=10;
   number(n);
}
}


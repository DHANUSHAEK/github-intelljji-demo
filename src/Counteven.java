//10. Develop a Java program to find the number of even numbers in an array?

import java.util.Scanner;

public class Counteven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countEven(arr, n));
        sc.close();
    }

    static int countEven(int[] arr, int n) {
        if (n == 0) return 0;

        int count = countEven(arr, n - 1);


        if (arr[n - 1] % 2 == 0)
            return count + 1;
        else
            return count;
    }
}

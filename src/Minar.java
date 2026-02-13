//9. Develop a Java program to find the minimum number in an array?
import java.util.Scanner;

public class Minar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = findMin(arr, n);
        System.out.println(min);

        sc.close();
    }

    static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int mino = findMin(arr, n - 1);
        if (arr[n - 1] < mino) {
            return arr[n - 1];
        } else {
            return mino;
        }
    }
}

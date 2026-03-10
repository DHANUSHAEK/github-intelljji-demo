import java.util.*;

public class SpiralMatrix {

    public static void main(String[] args) {

        int n = 3;
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        int num = 1;

        while (top <= bottom && left <= right) {

            // left → right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
                System.out.println(matrix[top][i]);
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
                System.out.println(matrix[i][right]);
            }
            right--;

            // right → left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
                System.out.println(matrix[bottom][i]);
            }
            bottom--;

            // bottom → top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
                System.out.println(matrix[i][left]);
            }
            left++;
        }

        // print matrix
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
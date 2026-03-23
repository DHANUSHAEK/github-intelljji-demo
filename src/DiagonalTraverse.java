import java.util.Arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = mat.length;
        int m = mat[0].length;
        int[] result = new int[n * m];
        int col = 0;
        int row = 0;
        int direction = 1;
        for (int loop = 0; loop < result.length; loop++) {
            result[loop] = mat[row][col];
            if (direction == 1) {
                if (col == m - 1) {
                    row++;
                    direction = -1;
                } else if (row == 0) {
                    col++;
                    direction = -1;
                } else {
                    col++;
                    row--;
                }
            } else {
                if (row == n - 1) {
                    col++;
                    direction = 1;
                } else if(col==0){
                    row++;
                    direction=1;
                }
                else {
                    col--;
                    row++;
                }

            }

        }
        System.out.println(Arrays.toString(result));
    }
}

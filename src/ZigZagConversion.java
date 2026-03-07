public class ZigZagConversion {

    public static String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        String[] rows = new String[numRows];

        for (int start = 0; start < numRows; start++) {
            rows[start] = "";
        }

        int currentRow = 0;
        boolean goingDown = true;

        for (int start = 0; start < s.length(); start++) {

            char character = s.charAt(start);

            rows[currentRow] = rows[currentRow] + character;

            if (currentRow == 0) {
                goingDown = true;
            }
            else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        String result = "";

        for (int start = 0; start < numRows; start++) {
            result = result + rows[start];
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 3;

        String output = convert(s, numRows);

        System.out.println(output);
    }
}
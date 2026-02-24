import java.util.Arrays;

public class BagOfTokens {
    static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0;
        int n = tokens.length;
        int right = n - 1;
        int score = 0;
        int maxScore = 0;

        while (left <= right) {
            if (power >= tokens[left]) {
                score++;
                power -= tokens[left];
                left++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                score--;
                power += tokens[right];
                right--;
            } else {
                break;
            }
        }
        return maxScore;
    }
    public static void main(String[] args) {
        int[] tokens = {100, 200, 300, 400};
        int power = 200;
        int result = bagOfTokensScore(tokens, power);
        System.out.println(result);
    }


}
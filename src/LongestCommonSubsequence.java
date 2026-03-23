public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int first=1;first<=text1.length();first++){
            for(int second=1;second<=text2.length();second++){
                if(text1.charAt(first-1)==text2.charAt(second-1)){
                    dp[first][second]=1+dp[first-1][second-1];
                }
                else{
                    if(dp[first-1][second]>dp[first][second-1]){
                        dp[first][second]=dp[first-1][second];
                    }
                    else {
                        dp[first][second]=dp[first][second-1];
                    }
                }
            }
        }
        System.out.println(dp[text1.length()][text2.length()]);
    }
}

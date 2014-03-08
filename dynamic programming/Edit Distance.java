public class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp =new int[word1.length()+1][word2.length()+1];
        for(int i = 0;i<word1.length()+1;i++){
            dp[i][0] = i;
        }
        for(int j = 0;j<word2.length()+1;j++){
            dp[0][j] = j;
        }
        for(int i=1;i<word1.length()+1;i++){
            for(int j=1;j<word2.length()+1;j++){
                int k = word1.charAt(i-1)==word2.charAt(j-1)?0:1;
                dp[i][j] = Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+k);
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
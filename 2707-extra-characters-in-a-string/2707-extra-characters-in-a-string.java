class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        int[] dp = new int[n + 1]; 
        for (int i = 0; i <= n; i++) {
            dp[i] = i;
        }
        
        for (int i = 0; i < n; i++) {
            for (String word : dictionary) {
                int wordLen = word.length();
                if (i + wordLen <= n && s.substring(i, i + wordLen).equals(word)) {
                    dp[i + wordLen] = Math.min(dp[i + wordLen], dp[i]);
                }
            }
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
        }
        
        return dp[n];
    }
}
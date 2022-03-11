// Que link: https://leetcode.com/problems/decode-ways/
// 91. Decode Ways


class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] = 1;
        dp[1] = s.charAt(0)=='0' ? 0 : 1;
        for(int i=2; i<= len; i++){
            int oneDigit = Integer.valueOf(s.substring(i-1, i));
            int twoDigit = Integer.valueOf(s.substring(i-2, i));
            
            if(oneDigit>0)
                dp[i] += dp[i-1];
            if(twoDigit>=10 && twoDigit<=26)
                dp[i] += dp[i-2];
        }
        return dp[len];
    }
}
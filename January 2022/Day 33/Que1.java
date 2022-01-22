// Que link: https://leetcode.com/problems/stone-game-iv/
// 1510. Stone Game IV



class Que1 {
    static public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 1; i <= n; ++i) {
            for (int k = 1; k * k <= i; ++k) {
                if (!dp[i - k * k]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(winnerSquareGame(4));
    }
}
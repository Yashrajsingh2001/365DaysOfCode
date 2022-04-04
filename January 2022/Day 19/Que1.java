// Que link: https://leetcode.com/problems/cherry-pickup-ii/

// Easy to understand.
class Solution {
    public int cherryPickup(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int dp[][][]=new int[row][col][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return dfs(0,0,col-1,dp,grid);
    }
    
    static int dfs(int r,int c1,int c2,int dp[][][],int grid[][]){
        if(r>=grid.length || c1<0 || c1>=grid[0].length || c2<0 || c2>=grid[0].length )
            return 0;
        
        if(dp[r][c1][c2]!=-1)
            return dp[r][c1][c2];
        
        int result=0;
        if(r<grid.length){
            result+=grid[r][c1];
            if(c1!=c2)
                result+=grid[r][c2];
            
            int max=0;
            for(int i=c1-1;i<=c1+1;i++){
                for(int j=c2-1;j<=c2+1;j++){
                    max=Math.max(max,dfs(r+1,i,j,dp,grid));
                }
            }
            result+=max;
            dp[r][c1][c2]=result;
        }
        return result;
    }
}




//? Alternative solutions: from discussion forum
//* Almost same as method 1 but a little bit different:
// Solution link: https://leetcode.com/problems/cherry-pickup-ii/discuss/1674363/Easy-oror-Intuition-oror-GO-As-Question-says
class Solution {
	public int cherryPickup(int[][] grid) {
		int m = grid.length, n = grid[0].length;
		Integer[][][] dp = new Integer[m][n][n];
		return dfs(grid,m,n,0,0,n-1,dp);
	}

	public int dfs(int[][] grid,int m,int n,int r,int c1,int c2,Integer[][][] dp){
		if(r==m)
			return 0;
		if (dp[r][c1][c2]!=null)
			return dp[r][c1][c2];

		int res = 0;
		for(int p=c1-1;p<=c1+1;p+=1){
			for(int q=c2-1;q<=c2+1;q+=1){
				if(p>=0 && p<n && q>=0 && q<n){
					res = Math.max(res, dfs(grid,m,n,r+1,p,q,dp));
				}
			}
		}

		int ch = c1==c2 ? grid[r][c1] : grid[r][c1]+grid[r][c2];

		dp[r][c1][c2] = ch+res;
		return dp[r][c1][c2];
	}
}





// Solution link: https://leetcode.com/problems/cherry-pickup-ii/discuss/978318/Java-Beats-100-concise-top-down-and-bottom-up-DP-with-explanation
public int cherryPickup(int[][] grid) {
    int C = grid[0].length;
    int[][] dp = new int[C][C], old = new int[C][C];
    for(int r = grid.length - 1; r >= 0; r--) {
        for(int c1 = Math.min(r, C - 1); c1 >= 0; c1--) {
            for(int c2 = Math.max(c1, C - 1 - r); c2 < C; c2++) {
                int max = 0;
                for(int i = c1 - 1; i <= c1 + 1; i++) {
                    for(int j = c2 - 1; j <= c2 + 1; j++) {
                        if(i >= 0 && i < C && j >= 0 && j < C && i <= j) max = Math.max(max, old[i][j]);
                    }
                }
                dp[c1][c2] = max + grid[r][c1] + (c1 == c2 ? 0 : grid[r][c2]);
            }
        }
        int[][] temp = dp; dp = old; old = temp;
    }
    return old[0][C - 1];
}
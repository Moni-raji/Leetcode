class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int dp[][]=new int[r][c];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return find(r-1,c-1,grid,dp);
    }
    public static int find(int i,int j,int[][] grid,int[][] dp){
        if(i==0 && j==0) return grid[i][j];
        if(i<0 || j<0) return 1000000000;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up=grid[i][j]+find(i-1,j,grid,dp);
        int left=grid[i][j]+find(i,j-1,grid,dp);
        dp[i][j]=Math.min(up,left);
        return dp[i][j];
    }
}
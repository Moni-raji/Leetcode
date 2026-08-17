class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost,dp),solve(1,cost,dp));
    }
    public int solve(int i,int arr[],int dp[]){
        int n=arr.length;
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int first=solve(i+1,arr,dp);
        int second=solve(i+2,arr,dp);
        dp[i]=arr[i]+Math.min(first,second);
        return dp[i];
    }
}
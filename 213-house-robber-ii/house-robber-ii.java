class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int a[]=new int[n-1];
        int b[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=nums[i];
        }
        for(int i=0;i<n-1;i++){
            b[i]=nums[i+1];
        }
        return Math.max(robb(a),robb(b));
    }
    public int robb(int[] arr){
        if(arr.length==1) return arr[0];
        if(arr.length==2) return Math.max(arr[0],arr[1]);
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[arr.length-1];
    }
}
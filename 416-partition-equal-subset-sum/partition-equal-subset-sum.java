class Solution {
    Boolean memo[][];
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int x:nums){
            total+=x;
        }
        if(total%2 != 0) return false;
        int sum=total/2;
        memo=new Boolean[nums.length][sum+1];
        return find(0,nums,sum);
    }
    public boolean find(int i,int arr[],int sum){
        if(sum==0) return true;
        if(i==arr.length) return false;
        if (memo[i][sum] != null) {
            return memo[i][sum];
        }
        boolean take = false;
        if (arr[i] <= sum) {
            take = find(i + 1, arr, sum - arr[i]);
        }
        boolean notTake = find(i + 1, arr, sum);
        memo[i][sum] = take || notTake;
        return memo[i][sum];
    }
}
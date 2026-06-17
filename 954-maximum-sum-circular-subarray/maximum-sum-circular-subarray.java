class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int currmax=0;
        int currmin=0;
        int max=nums[0],min=nums[0];
        int t=0;
        for(int i=0;i<n;i++){
            currmax=Math.max(nums[i],currmax+nums[i]);
            max=Math.max(max,currmax);
            currmin=Math.min(nums[i],currmin+nums[i]);
            min=Math.min(min,currmin);
            t+=nums[i];
        }
        if(max<0) return max;
        return Math.max(max,t-min);
    }
}
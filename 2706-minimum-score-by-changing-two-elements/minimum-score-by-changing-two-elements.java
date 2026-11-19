class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int r=Integer.MAX_VALUE;
        r=Math.min(r,nums[n-1]-nums[2]);
        r=Math.min(r,nums[n-2]-nums[1]);
        r=Math.min(r,nums[n-3]-nums[0]);
        return r;
    }
}
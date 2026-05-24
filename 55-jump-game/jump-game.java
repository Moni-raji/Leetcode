class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        int r=0;
        for(int i=0;i<n;i++){
            if(i>r) return false;
            r=Math.max(r,i+nums[i]);
            if(r>=n-1) return true;
        }
        return false;
    }
}
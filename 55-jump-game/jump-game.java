class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        int max_step_reached=0;
        for(int i=0;i<n;i++){
            if(i>max_step_reached) return false;
            max_step_reached=Math.max(max_step_reached,i+nums[i]);
            if(max_step_reached>=n-1) return true;
        }
        return max_step_reached>=n-1;
    }
}
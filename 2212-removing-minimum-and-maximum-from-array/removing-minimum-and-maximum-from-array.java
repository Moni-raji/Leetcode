class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1 || n==2) return n;
        int mini=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[mini]){
                mini=i;
            }
            if(nums[i]>nums[maxi]){
                maxi=i;
            }
        }
        int left=Math.min(mini,maxi);
        int right=Math.max(mini,maxi);
        int front=right+1;
        int back=n-left;
        int both=(left+1)+(n-right);
        return Math.min(front,Math.min(back,both));
    }
}
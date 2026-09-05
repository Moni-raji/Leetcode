class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min[]=new int[n];
        int mini=nums[n-1];
        for(int i=n-1;i>=0;i--){
            mini=Math.min(mini,nums[i]);
            min[i]=mini;
        }
        int maxi=nums[0];
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
            int a=maxi-min[i];
            if(a<=k) return i;
        }
        return -1;
    }
}
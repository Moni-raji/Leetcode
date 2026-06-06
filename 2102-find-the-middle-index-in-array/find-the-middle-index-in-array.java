class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            int r=total-left-nums[i];
            if(r==left) return i;
            left+=nums[i];
        }
        return -1;
    }
}
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int countz=0;
        for(int a:nums){
            if(a==0) countz++;
        }
        if(countz==nums.length) return 0;
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int val=queries[i][2];
            for(int j=l;j<=r;j++){
                if(nums[j]==0) continue;
                if(val<=nums[j]) nums[j]-=val;
                else nums[j]=0;
                if(nums[j]==0) countz++;
            }
            if(countz==nums.length) return i+1;
        } 
        return -1;
    }
}
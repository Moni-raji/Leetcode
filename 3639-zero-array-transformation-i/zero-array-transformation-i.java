class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int diff[]=new int[n+1];
        for(int[] a:queries){
            int l=a[0];
            int r=a[1];
            diff[l]++;
            if(r+1<n){
                diff[r+1]--;
            }
        }
        int totalrange=0;
        for(int i=0;i<n;i++){
            totalrange+=diff[i];
            if(totalrange<nums[i]) return false;
        }
        return true;
    }
}
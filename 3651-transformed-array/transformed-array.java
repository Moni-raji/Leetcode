class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            int index = ((i + nums[i]) % n + n) % n;
            r[i]=nums[index];
        }
        return r;
    }
}
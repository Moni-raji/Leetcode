class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int r=0;
        boolean zero=true;
        for(int a:nums){
            r^=a;
            if(a!=0) zero=false;
        }
        if(zero) return 0;
        return (r==0)?n-1:n;
    }
}
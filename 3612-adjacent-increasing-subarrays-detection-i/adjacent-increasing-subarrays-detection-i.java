class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        for(int i=0;i+2*k<=n;i++){
            if(inc(nums,i,k) && inc(nums,i+k,k)) return true;
        }
        return false;
    }
    public boolean inc(List<Integer> nums,int start,int end){
        for(int i=start;i<start+end-1;i++){
            if(nums.get(i)>=nums.get(i+1)) return false;
        }
        return true;
    }
}
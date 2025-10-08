class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n=nums.size();
        int left=0;
        int right=n/2;
        while(left<n/2 && right<n){
            if(nums.get(left)<nums.get(right)){
                left++;
            }
            right++;
        }
        return n-left*2;
         
    }
}
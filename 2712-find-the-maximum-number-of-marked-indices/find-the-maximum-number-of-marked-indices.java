class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        int left=0;
        int right=n/2;
        while(left<n/2 && right<n){
            if(nums[left]*2 <= nums[right]){
                count+=2;
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        return count;
    }
}
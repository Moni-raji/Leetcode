class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int a=nums[left]+nums[right];
            if(a==0) return nums[right];
            else if(a>0) right--;
            else left++;
        }
        return -1;
    }
}
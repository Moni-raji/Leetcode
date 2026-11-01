class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int median=nums[n/2];
        int total=0;
        for(int a:nums){
            total+=Math.abs(median-a);
        }
        return total;
    }
}
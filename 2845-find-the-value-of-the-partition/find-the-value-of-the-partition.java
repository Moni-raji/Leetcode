class Solution {
    public int findValueOfPartition(int[] nums) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int diff=Math.abs(nums[i]-nums[i+1]);
            min=Math.min(min,diff);
        }
        return min;
    }
}
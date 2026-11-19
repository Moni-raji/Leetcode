class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int r=Integer.MAX_VALUE;
        r=Math.min(r,nums[n-1]-nums[2]);
        r=Math.min(r,nums[n-2]-nums[1]);
        r=Math.min(r,nums[n-3]-nums[0]);
        return r;
    }
}
//the 2 elements can be replaced with a single element so that the low score diff is zero
//Now we need to consider only the high score
//there are 3 possiblities
//change the 2 smallest element (or) change the smallest and lasrgest element (or) change the 2 largest element

//find the min value obtained from the diff of the remaining elements
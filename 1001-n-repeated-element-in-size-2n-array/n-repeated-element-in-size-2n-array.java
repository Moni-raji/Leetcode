class Solution {
    public int repeatedNTimes(int[] nums) {
        /*Arrays.sort(nums);
        int len=nums.length;
        int n=len/2;
        int i=0;
        int count=0;
        int prev=Integer.MIN_VALUE;
        while(i<len){
            if(nums[i]!=prev){
                count=0;
                prev=nums[i];
                count++;
            }
            else{
                count++;
                if(count==n) return prev;
            }
            i++;
        }
        return -1;*/
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1] || nums[i]==nums[i+2]) return nums[i];
        }
        return nums[nums.length-1];
    }
}
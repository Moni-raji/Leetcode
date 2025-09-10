class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        int i=0;
        int prev=Integer.MIN_VALUE;
        int count=0;
        while(i<len){
            if(nums[i]==1) count++;
            else{
                if(count>prev) prev=count;
                count=0;
            }
            i++;
        }
        if(count>prev) prev=count;
        return prev;
    }
}
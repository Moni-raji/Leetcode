class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len=nums.length;
        int i=0;
        int result=Integer.MIN_VALUE;
        int count=0;
        int prev=0;
        while(i<len){
            if(nums[i]>prev){
                prev=nums[i];
                count++;
            }
            else{
                if(count>result) result=count;
                count=1;
                prev=nums[i];
            }
            i++;
        }
        if(result<count) result=count;
        return result;
    }
}
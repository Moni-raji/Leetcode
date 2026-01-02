class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
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
        return -1;
    }
}
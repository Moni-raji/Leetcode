class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        int i=0;
        int parity=0;
        int j=0;
        while(n>1){
            if(parity%2==0){
                nums[i++]=Math.min(nums[j],nums[j+1]);
                parity++;
            }
            else{
                nums[i++]=Math.max(nums[j],nums[j+1]);
                parity++;
            }
            j+=2;
            if(j>=n){
                i=0;
                j=0;
                parity=0;
                n/=2;
            }
        }
        return nums[0];
    }
}
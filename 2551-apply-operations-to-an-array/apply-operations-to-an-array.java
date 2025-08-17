class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int r=0;
        for(int n:nums){
            if(n!=0){
                nums[r++]=n;
            }
        }
        while(r<nums.length){
            nums[r++]=0;
        }
        return nums;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=a){
                a=nums[i];
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
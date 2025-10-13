class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int a=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==a){
                count++;
            }
            else{
                a=nums[i];
                count=1;
            }
            if(count<3){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
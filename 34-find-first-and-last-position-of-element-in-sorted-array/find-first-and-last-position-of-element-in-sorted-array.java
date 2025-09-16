class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=-1;
        int b=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                b=i;
                break;
            }
        }
        return new int[] {a,b};
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int a=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0) a=nums[i];
            count+=(nums[i]==a)?1:-1;
        }
        return a;
    }
}
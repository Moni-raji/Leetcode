class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        int sum2=0;
        for(int i=0;i<=len;i++){
            sum2+=i;
        }
        return sum2-sum;

    }
}
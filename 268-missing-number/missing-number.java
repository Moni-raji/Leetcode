class Solution {
    public int missingNumber(int[] nums) {
        /*int sum=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        int sum2=0;
        for(int i=0;i<=len;i++){
            sum2+=i;
        }
        return sum2-sum;*/
        int len=nums.length;
        Arrays.sort(nums);
        int a=Integer.MIN_VALUE;
        if(nums[0]!=0) return 0;
        for(int i=0;i<len-1;i++){
            if(nums[i]!=nums[i+1]-1) return nums[i]+1;
        }
        return nums[len-1]+1;

    }
}
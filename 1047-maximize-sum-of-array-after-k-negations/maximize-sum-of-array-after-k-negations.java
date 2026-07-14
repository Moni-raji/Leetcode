class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        int sum=0;
        while(i<n && k!=0 && nums[i]<0){
            nums[i]=nums[i]*-1;
            k--;
            i++;
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            min=Math.min(min,nums[j]);
        }
        if(k%2==1){
            sum-=2*min;
        }
        return sum;
    }
}
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        if(n==1) return new int[]{0};
        int left[]=new int[n];
        left[0]=0;
        int right[]=new int[n];
        right[n-1]=0;
        for(int i=1;i<n;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=nums[j];
            }
            left[i]=sum;
        }
        for(int i=0;i<n-1;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
            }
            right[i]=sum;
        }
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            r[i]=Math.abs(left[i]-right[i]);
        }
        return r;
    }
}
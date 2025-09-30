class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double arr[]=new double[n/2];
        for(int i=0;i<n/2;i++){
            double a=(nums[i]+nums[n-i-1])/2.0;
            arr[i]=a;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}
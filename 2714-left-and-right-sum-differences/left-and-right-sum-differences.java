class Solution {
    public int[] leftRightDifference(int[] nums) {
        /*
        int n=nums.length;
        int r[]=new int[n];
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        right[n-1]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            r[i]=Math.abs(left[i]-right[i]);
        }
        return r;
        */

        int n=nums.length;
        int result[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int l=0;
        for(int i=0;i<n;i++){
            int r=total-l-nums[i];
            result[i]=Math.abs(l-r);
            l+=nums[i]; 
        }
        return result;
    }
}
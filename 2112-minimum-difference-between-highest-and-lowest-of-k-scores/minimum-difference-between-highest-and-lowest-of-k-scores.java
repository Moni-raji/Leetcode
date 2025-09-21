class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int i=0;
        int a=nums.length-k;
        while(i<=a){
            int b=nums[i+k-1]-nums[i];
            if(b<min) min=b;
            i++;
        }
        return min;
        
    }
}
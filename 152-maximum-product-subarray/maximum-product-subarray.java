class Solution {
    public int maxProduct(int[] nums) {
        /*int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix = prefix*nums[i];
            suffix = suffix*nums[n-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;*/
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            prefix=prefix*nums[i];
            max=Math.max(max,prefix);
        }
        for(int i=n-1;i>=0;i--){
            if(suffix==0) suffix=1;
            suffix=suffix*nums[i];
            max=Math.max(max,suffix);
        }
        return max;
    }
}
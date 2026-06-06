class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        int pre[]=new int[n];
        int suff[]=new int[n];
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            pre[i]=set.size();
        }
        set.clear();
        suff[n-1]=0;
        set.add(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            suff[i]=set.size();
            set.add(nums[i]);
        }
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            r[i]=pre[i]-suff[i];
        }
        return r;
    }
}
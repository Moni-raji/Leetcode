class Solution {
    public List<Integer> findValidElements(int[] nums) {
       int n=nums.length;
       List<Integer> al=new ArrayList<>();
       int right[]=new int[n]; 
       int max=nums[n-1];
       for(int i=n-2;i>=0;i--){
        right[i]=max;
        max=Math.max(max,nums[i]);
       }
       int leftMax=nums[0];
       for(int i=0;i<n;i++){
        if(i==0 || i==n-1) al.add(nums[i]);
        else if(leftMax<nums[i] || right[i]<nums[i]){
            al.add(nums[i]);
        }
        leftMax=Math.max(leftMax,nums[i]);
       }
       return al;
    }
}
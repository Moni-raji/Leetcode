class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int a=nums[i];
            arr[i]=nums[a];
        }
        return arr;
    }
}
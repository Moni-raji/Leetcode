class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[j]=nums[i];
                j+=2;
            }
        }
        int k=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[k]=nums[i];
                k+=2;
            }
        }
        return arr;
    }
}
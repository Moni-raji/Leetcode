class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=firstOccu(nums,target);
        int b=lastOccu(nums,target);
        return new int[]{a,b};
    }
    public int firstOccu(int[] nums,int target){
        int r=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                r=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return r;
    }
    public int lastOccu(int[] nums,int target){
        int r=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                r=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return r;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=firstOccurence(nums,target);
        int b=lastOccurence(nums,target);
        return new int[]{a,b};
    }
    public int firstOccurence(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int r=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                r=mid;
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else right=mid-1;
        }
        return r;
    }
    public int lastOccurence(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int r=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                r=mid;
                left=mid+1;
            }
            else if(arr[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return r;
    }
}
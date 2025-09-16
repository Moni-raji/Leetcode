class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=first(nums,target);
        int b=last(nums,target);
        return new int[] {a,b};
    }
    public int first(int[] arr,int t){
        int r=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(arr[mid]==t){
                r=mid;
                high=mid-1;
            }
            else if(arr[mid]<t){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return r;
    }
    public int last(int[] arr,int t){
        int r=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(arr[mid]==t){
                r=mid;
                low=mid+1;
            }
            else if(arr[mid]<t){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return r;
    }
}
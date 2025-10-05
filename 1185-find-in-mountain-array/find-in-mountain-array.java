/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int h=heap(mountainArr);
        int a=binarySearch(mountainArr,target,0,h,true);
        if(a!= -1) return a;
        return binarySearch(mountainArr,target,h+1,mountainArr.length()-1,false);
    }
    public int heap(MountainArray arr){
        int left=0;
        int right=arr.length()-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr.get(mid)>arr.get(mid+1)) right=mid;
            else left=mid+1;
        }
        return left;
    }
    public int binarySearch(MountainArray arr,int target,int start,int end,boolean isasc){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target) return mid;
            if(isasc){
                if(target<arr.get(mid)) end=mid-1;
                else start=mid+1;
            }
            else{
                if(target>arr.get(mid)) end=mid-1;
                else start=mid+1;
            }
        }
        return -1;
    }
}
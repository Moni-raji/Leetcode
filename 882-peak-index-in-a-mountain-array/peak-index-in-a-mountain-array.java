class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=1;
        while(i<arr.length){
            if(arr[i-1]>arr[i]) return i-1;
            i++;
        }
        return -1;
    }
}
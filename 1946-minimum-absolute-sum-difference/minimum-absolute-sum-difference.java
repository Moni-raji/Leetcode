class Solution {
    int MOD = 1000000007;
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n=nums1.length;
        long total=0;
        for(int i=0;i<n;i++){
            total+=Math.abs(nums1[i]-nums2[i]);
        }
        long min=total;
        int arr[]=nums1.clone();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int curr=Math.abs(nums1[i]-nums2[i]);
            int ind=binary(arr,nums2[i]);
            int best=curr;
            if(ind<n){
                best=Math.min(best,Math.abs(arr[ind]-nums2[i]));
            }
            if(ind>0){
                best=Math.min(best,Math.abs(arr[ind-1]-nums2[i]));
            }
            min=Math.min(min,total-curr+best);
        }
        return (int)(min%MOD);
    }
    public int binary(int arr[],int t){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<t) left=mid+1;
            else right=mid;
        }
        return left;
    }
}
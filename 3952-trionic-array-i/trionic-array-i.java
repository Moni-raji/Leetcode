class Solution {
    public boolean isTrionic(int[] arr) {
        int n=arr.length;
        if(n<=3) return false;
        int i=0;
        while(i+1<n && arr[i]<arr[i+1]) i++;
        if(i==0) return false;
        int j=i;
        while(j+1<n && arr[j]>arr[j+1]) j++;
        if(j==i) return false;
        int k=j;
        while(k+1<n && arr[k]<arr[k+1]) k++;
        if(k==j) return false;
        return (k==n-1);
    }
}
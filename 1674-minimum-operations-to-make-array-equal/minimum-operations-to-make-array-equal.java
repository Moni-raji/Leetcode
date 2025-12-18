class Solution {
    public int minOperations(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
        }
        int midelement=0;
        int mid=n/2;
        if(n%2==0){
            midelement=(arr[mid]+arr[mid-1])/2;

        }
        else{
            midelement=arr[mid];
        }
        int total=0;
        for(int i=0;i<mid;i++){
            total+=(midelement-arr[i]);
        }
        return total;
    }
}
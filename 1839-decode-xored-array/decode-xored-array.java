class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int arr[]=new int[n+1];
        arr[0]=first;
        int xor=first;
        for(int i=1;i<n+1;i++){
            xor^=encoded[i-1];
            arr[i]=xor;
        }
        return arr;
    }
}
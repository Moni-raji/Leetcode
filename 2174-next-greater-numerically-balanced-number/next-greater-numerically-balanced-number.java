class Solution {
    public int nextBeautifulNumber(int n) {
        int r=n+1;
        while(true){
            if(isBalanced(r)){
                return r;
            }
            r++;
        }
    }
    public boolean isBalanced(int n){
        int arr[]=new int[10];
        while(n>0){
            int d=n%10;
            arr[d]++;
            n/=10;
        }
        for(int i=0;i<=9;i++){
            if(arr[i]>0 && arr[i]!=i) return false;
        }
        return true;
    }
}
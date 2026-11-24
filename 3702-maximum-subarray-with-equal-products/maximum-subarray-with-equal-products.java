class Solution {
    public int maxLength(int[] arr) {
        int max=1;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int pro=arr[i];
            int g=arr[i];
            int l=arr[i];
            for(int j=i+1;j<n;j++){
                pro*=arr[j];
                g=gcd(g,arr[j]);
                l=(l*arr[j])/gcd(l,arr[j]);
                if(pro==l*g){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
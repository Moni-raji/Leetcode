class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int a=s.length();
        int sum=0;
        if(a%2==0){
            sum=find(n,-1);
        }
        else{
            sum=find(n,1);
        }
        return sum;
    }
    public int find(int a,int p){
        int sum=0;
        while(a!=0){
            sum+=(a%10)*p;
            p*=-1;
            a/=10;
        }
        return sum;
    }
}
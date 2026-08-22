class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int pro=1;
        while(n>0){
            int a=n%10;
            sum+=a;
            pro*=a;
            n/=10;
        }
        return org%(sum+pro)==0;
    }
}
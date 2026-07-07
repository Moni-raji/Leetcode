class Solution {
    public long sumAndMultiply(int n) {
       long sum=0;
       long a=0;
       long pro=1;
       while(n>0){
        int unit=n%10;
        if(unit !=0){
            sum+=unit;
            a+=unit*pro;
            pro*=10;
        }
        n/=10;
       }
       long ans=(long)(sum*a);
       return ans;
    }
}
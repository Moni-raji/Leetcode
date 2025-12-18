class Solution {
    public double myPow(double x, int n) {
        double result=1.0;
        long a=n;
        if(a<0) a=(-1)*a;
        while(a>0){
            if(a%2==0){
                x=x*x;
                a/=2;
            }
            else{
                result=result*x;
                a=a-1;
            }
        }
        if(n<0) return 1.0/result;
        return result;

    }
}
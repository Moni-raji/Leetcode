class Solution {
    public int smallestNumber(int n, int t) {
        int a=n;
        while(product(a)%t !=0){
            a++;
        }
        return a;
    }
    public int product(int n){
        int pro=1;
        while(n!=0){
            pro*=(n%10);
            n/=10;
        }
        return pro;
    }
}
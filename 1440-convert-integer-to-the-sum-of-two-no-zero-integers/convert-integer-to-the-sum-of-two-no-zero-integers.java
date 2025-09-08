class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=1;
        int b=n-a;
        while(!zero(a) || !zero(b)){
            a++;
            b=n-a;
        }
        return new int[] {a,b};

    }
    public boolean zero(int n){
        while(n!=0){
            if(n%10 == 0) return false;
            n/=10;
        }
        return true;
    }
}
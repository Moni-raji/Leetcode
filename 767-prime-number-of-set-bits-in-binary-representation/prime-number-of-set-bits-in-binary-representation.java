class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int a=0;
            int num=i;
            while(num!=0){
                if(num%2==1) a++;
                num/=2;
            }
            if(isprime(a)) count++;
        }
        return count;
    }
    public static boolean isprime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
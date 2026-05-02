class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(good(i)) count++;
        }
        return count;
    }
    public boolean good(int n){
        boolean b=false;
        while(n!=0){
            int a=n%10;
            if(a==3 || a==4 || a==7) return false;
            else if(a==2 || a==5 || a==6 || a==9) b=true;
            n/=10;
        }
        return b;
    }
}
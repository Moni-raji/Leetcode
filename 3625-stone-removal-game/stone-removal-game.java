class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int count=0;
        int a=10;
        while(n>=a){
            n-=a;
            a--;
            count++;
        }
        if(count%2==0) return false;
        return true;
    }
}
class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int s=1;
        while(n>=s){
            n-=s;
            s++;
            count++;
        }
        return count;
    }
}
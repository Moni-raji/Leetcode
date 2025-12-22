class Solution {
    public int reverse(int x) {
        int s=(x<0)?-1:1;
        x=Math.abs(x);
        int rev=0;
        while(x!=0){
            if(rev>(Integer.MAX_VALUE-x%10)/10) return 0;
            rev=(rev*10)+x%10;
            x/=10;
        }
        return rev*s;
    }
}
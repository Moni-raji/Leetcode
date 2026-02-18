class Solution {
    public boolean hasAlternatingBits(int n) {
        /*String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)) return false;
        }
        return true;*/
        int a=n^(n>>1);
        if((a & (a+1)) ==0) return true;
        return false;
    }
}
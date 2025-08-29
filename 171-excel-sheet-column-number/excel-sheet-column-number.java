class Solution {
    public int titleToNumber(String s) {
        int sum=0,pro=1;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            int a=c-'A'+1;
            sum+=(a*pro);
            pro*=26;
        }
        return sum;
    }
}
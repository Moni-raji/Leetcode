class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int a=Math.abs((int)(s.charAt(i)) - (int)(s.charAt(i+1)));
            sum+=a;
        }
        return sum;
    }
}
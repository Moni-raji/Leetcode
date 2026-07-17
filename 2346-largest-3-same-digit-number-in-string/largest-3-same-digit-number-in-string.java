class Solution {
    public String largestGoodInteger(String num) {
        int max=Integer.MIN_VALUE;
        String r="";
        int n=num.length();
        for(int i=0;i<=n-3;i++){
            String a=num.substring(i,i+3);
            int b=a.charAt(0)-'0';
            if(same(a) && b>max){
                r=a;
                max=b;
            }
        }
        return r;
    }
    public boolean same(String s){
        char c=s.charAt(0);
        for(char a:s.toCharArray()){
            if(a!=c) return false;
        }
        return true;
    }
}
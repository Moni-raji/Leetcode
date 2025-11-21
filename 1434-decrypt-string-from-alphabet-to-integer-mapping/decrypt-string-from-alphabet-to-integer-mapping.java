class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int n=0;
        while(i<s.length()){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                n=Integer.parseInt(s.substring(i,i+2));
                i+=3;
            }
            else{
                n=s.charAt(i)-'0';
                i++;
            }
            sb.append((char)('a'+n-1));
        }
        return sb.toString();
    }
}
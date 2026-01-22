class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)) sb.append(c);
            else{
                char a=s.charAt(i-1);
                sb.append((char)(a+(int)c-'0'));
            }
        }
        return sb.toString();
    }
}
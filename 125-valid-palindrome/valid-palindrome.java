class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String a=sb.toString();
        String b=sb.reverse().toString();
        if(a.equals(b)) return true;
        return false;
    }
}
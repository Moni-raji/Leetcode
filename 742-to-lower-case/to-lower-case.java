class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(c);
        }
        return sb.toString();
    }
}
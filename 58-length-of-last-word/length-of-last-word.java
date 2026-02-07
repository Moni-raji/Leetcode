class Solution {
    public int lengthOfLastWord(String s) {
       String parts[]=s.split(" ");
       String st=parts[parts.length-1];
       return st.length();
    }
}
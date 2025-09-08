class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        for(String a:s.split(" ")){
            StringBuilder x=new StringBuilder(a);
            sb.append(x.reverse().toString()).append(" ");
        }
        String b=sb.toString();
        return b.substring(0,b.length()-1);
    }
}
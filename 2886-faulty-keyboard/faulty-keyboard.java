class Solution {
    public String finalString(String s) {
       StringBuilder sb=new StringBuilder();
       int i=0;
       while(i<s.length()){
        if(s.charAt(i)=='i') sb.reverse();
        else sb.append(s.charAt(i));
        i++;
       } 
       return sb.toString();
       
    }
    public String rev(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
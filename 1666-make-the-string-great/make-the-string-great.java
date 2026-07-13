class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=1;
        while(i<sb.length()){
            char a=sb.charAt(i);
            char b=sb.charAt(i-1);
            if(Character.toLowerCase(a)==Character.toLowerCase(b)){
                if((Character.isUpperCase(a) && Character.isLowerCase(b)) || (Character.isUpperCase(b) && Character.isLowerCase(a))){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i-1);
                    i=Math.max(1,i-1);
                    continue;
                }
            }
            i++;
        }
        return sb.toString();
    }
}
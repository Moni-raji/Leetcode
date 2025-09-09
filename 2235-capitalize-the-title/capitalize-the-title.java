class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder();
        for(String s:title.split(" ")){
            if(s.length()==1 || s.length()==2) sb.append(s.toLowerCase());
            else{
                char c=Character.toUpperCase(s.charAt(0));
                String a=c+s.substring(1).toLowerCase();
                sb.append(a);
            }
            sb.append(" ");
        }
        String x=sb.toString();
        return x.substring(0,x.length()-1);
    }
}
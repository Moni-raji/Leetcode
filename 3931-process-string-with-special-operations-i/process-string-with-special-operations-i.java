class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) && Character.isLowerCase(c)) sb.append(c);
            else if(c=='*'){
                if(sb.length()>=1){
                    int n=sb.length();
                    String a=sb.toString();
                    sb.setLength(0);
                    sb.append(a.substring(0,n-1));
                }
            }
            else if(c=='#'){
                if(sb.length()>=1){
                    String a=sb.toString();
                    sb.append(a);
                }
            }
            else if(c=='%'){
                String r=rev(sb.toString());
                sb.setLength(0);
                sb.append(r);
            }
        }
        return sb.toString();
    }
    public String rev(String s){
        char c[]=s.toCharArray();
        int left=0;
        int right=c.length-1;
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        return new String(c);
    }
}
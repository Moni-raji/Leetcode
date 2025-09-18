class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase();
        String a=s.replaceAll("-","");
        int n=a.length()%k;
        StringBuilder sb=new StringBuilder();
        if (n > 0) {  
            sb.append(a.substring(0, n));
            if (n < a.length()) sb.append("-");
        }
        for(int i=n;i<a.length();i+=k){
            sb.append(a.substring(i,i+k));
            if(i<a.length()-k) sb.append("-");
        }
        return sb.toString();
    }
}
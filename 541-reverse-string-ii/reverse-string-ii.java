class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int n=2*k;
        int m=s.length()%n;
        int i=0;
        while(i<(s.length()-m)){
            String a=rev(s.substring(i,i+k));
            sb.append(a).append(s.substring(i+k,i+2*k));
            i+=(2*k);
        }
        if(m<k){
            sb.append(rev(s.substring(s.length()-m)));
        }
        else if(m<2*k && m>=k){
            sb.append(rev(s.substring(s.length()-m,s.length()-m+k)));
            sb.append(s.substring(s.length()-m+k));
        }
        return sb.toString();
    }
    public String rev(String a){
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        return sb.toString();
    }
}
class Solution {
    public boolean isSubstringPresent(String s) {
        int n=s.length();
        for(int i=0;i<=n-2;i++){
            String a=s.substring(i,i+2);
            StringBuilder sb=new StringBuilder(a);
            sb.reverse();
            if(s.indexOf(sb.toString())!=-1) return true;
        }
        return false;
    }
}
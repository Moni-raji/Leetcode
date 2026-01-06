class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=s.charAt(j)-'a';
            }
            int a=sum%26;
            sb.append((char)(a+'a'));
            i+=k;
        }
        return sb.toString();
    }
}
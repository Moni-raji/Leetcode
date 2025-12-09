class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        while(sb.length()<k){
            String s=sb.toString();
            for(int i=0;i<s.length();i++){
                sb.append((char)(s.charAt(i)+1));
            }
        }
        String result=sb.toString();
        return result.charAt(k-1);
    }
}
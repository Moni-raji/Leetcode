class Solution {
    public String addSpaces(String s, int[] spaces) {
        int a=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(a<spaces.length && i==spaces[a]){
                sb.append(" ");
                a++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
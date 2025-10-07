class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(String a:words){
            sb.append(a.charAt(0));
        }
        return sb.toString().equals(s);
    }
}
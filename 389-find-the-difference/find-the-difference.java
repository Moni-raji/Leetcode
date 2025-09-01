class Solution {
    public char findTheDifference(String s, String t) {
        char c1[]=s.toCharArray();
        Arrays.sort(c1);
        char c2[]=t.toCharArray();
        Arrays.sort(c2);
        int len=s.length();
        for(int i=0;i<len;i++){
            if(c1[i]!=c2[i]){
                return c2[i];
            }
        }
        return c2[len];
    }
}
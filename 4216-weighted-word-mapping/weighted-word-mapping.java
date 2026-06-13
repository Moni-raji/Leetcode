class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String r="";
        for(String a:words){
            int sum=0;
            for(char c:a.toCharArray()){
                sum+=weights[c-'a'];
            }
            sum=sum%26;
            char b=(char)((int)'z'-sum);
            r+=b;
        }
        return r;
    }
}
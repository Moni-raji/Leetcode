class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder r=new StringBuilder();
        for(String a:words){
            int sum=0;
            for(char c:a.toCharArray()){
                sum+=weights[c-'a'];
            }
            sum=sum%26;
            r.append((char)('z'-sum));
        }
        return r.toString();
    }
}
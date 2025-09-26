class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int n=sentences.length;
        for(int i=0;i<n;i++){
            int a=find(sentences[i]);
            if(a>max) max=a; 
        }
        return max;
    }
    public int find(String s){
        String p[]=s.split(" ");
        return p.length;
    }
}
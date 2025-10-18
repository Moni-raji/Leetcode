class Solution {
    public int longestBalanced(String s) {
        int max=0;
        int n=s.length();
        if(n==1) return 1;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                if(isbalanced(freq)) max=Math.max(max,j-i+1);
            }
        }
    return max;
    }
    public boolean isbalanced(int freq[]){
        int c=0;
        for(int a:freq){
            if(a>0){
            if(c==0) c=a;
            else if(c!=a) return false;
            }
        }
        return true;
    }
    
}
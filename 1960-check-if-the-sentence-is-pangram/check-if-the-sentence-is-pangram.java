class Solution {
    public boolean checkIfPangram(String sentence) {
        int freq[]=new int[26];
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            freq[c-'a']++;
        }
        for(int a:freq){
            if(a==0) return false;
        }
        return true;
    }
}
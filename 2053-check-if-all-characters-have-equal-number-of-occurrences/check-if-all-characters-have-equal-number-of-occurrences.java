class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        int max=0;
        for(char c:s.toCharArray()){
            freq[c-'a']++;
            max=Math.max(max,freq[c-'a']);
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0 && freq[i]!=max) return false;
        }
        return true;

    }
}
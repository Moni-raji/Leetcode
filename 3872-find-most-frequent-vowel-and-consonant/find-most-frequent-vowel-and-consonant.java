class Solution {
    public int maxFreqSum(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            if(!Character.isLetter(c)){
                return 0;
            }
            freq[c-'a']++;
        }
        int v=0;
        int cl=0;
        for(char c:s.toCharArray()){
            if(isVowel(c) && freq[c-'a']>v) v=freq[c-'a'];
            else if(!isVowel(c) && freq[c-'a']>cl) cl=freq[c-'a'];
        }
        return v+cl;
    }
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
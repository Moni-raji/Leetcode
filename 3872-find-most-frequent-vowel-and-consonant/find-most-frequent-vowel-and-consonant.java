class Solution {
    public int maxFreqSum(String s) {

        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            if(!Character.isLetter(c)) return 0;
            freq[c-'a']++;
        }
        int vm=0;
        int cm=0;
        for(char c:s.toCharArray()){
            if(isvowel(c) && freq[c-'a']>vm) vm=freq[c-'a'];
            else if(!isvowel(c) && freq[c-'a']>cm) cm=freq[c-'a'];
        }
        return vm+cm;
    }
    public boolean isvowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
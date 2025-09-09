class Solution {
    public int numberOfSpecialChars(String word) {
        int fre1[]=new int[26];
        int fre2[]=new int[26];
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)) fre2[c-'A']++;
            else fre1[c-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(fre1[i]>=1 && fre2[i]>=1) count++;
        }
        return count;
    }
}
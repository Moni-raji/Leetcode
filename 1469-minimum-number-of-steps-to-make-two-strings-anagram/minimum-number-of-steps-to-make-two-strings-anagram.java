class Solution {
    public int minSteps(String s, String t) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        int sum=0;
        for(int a:freq){
            if(a>0) sum+=a;
            else if(a<0) sum+=(a*-1);
        }
        return sum/2;
    }
}
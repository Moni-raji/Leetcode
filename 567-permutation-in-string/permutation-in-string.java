class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int freq[]=new int[26];
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        int k=s1.length();
        int arr[]=new int[26];
        for(int i=0;i<k;i++){
            arr[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,arr)) return true;
        for(int i=k;i<s2.length();i++){
            arr[s2.charAt(i-k)-'a']--;
            arr[s2.charAt(i)-'a']++;
            if(Arrays.equals(freq,arr)) return true;
        }
        return false;
    }
}
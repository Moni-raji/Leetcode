class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        /*int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int a:freq){
            if(a!=0) return false;
        }
        return true;*/
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:s.toCharArray()) map1.put(c,map1.getOrDefault(c,0)+1);
        for(char c:t.toCharArray()) map2.put(c,map2.getOrDefault(c,0)+1);
        return map1.equals(map2);

    }
}
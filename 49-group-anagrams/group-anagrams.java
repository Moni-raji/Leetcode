class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            StringBuilder sb=new StringBuilder();
            int freq[]=new int[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            for(int a:freq){
                sb.append('*');
                sb.append(a);
            }
            String key=sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
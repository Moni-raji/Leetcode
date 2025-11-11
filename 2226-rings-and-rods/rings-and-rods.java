class Solution {
    public int countPoints(String rings) {
        Map<Character,Set<Character>> map=new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            char color=rings.charAt(i);
            char r=rings.charAt(i+1);
            map.putIfAbsent(r,new HashSet<>());
            map.get(r).add(color);
        }
        int count=0;
        for(Set<Character> s:map.values()){
            if(s.contains('R') && s.contains('B') && s.contains('G')) count++;
        }
        return count;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char a=t.charAt(i);
            if(!map.containsKey(a)){
                return false;
            }
            int count=map.get(a)-1;
            if(count<0) return false;
            map.put(a,count);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()>0){
                return false;
            }
        }
        return true;
    }
}
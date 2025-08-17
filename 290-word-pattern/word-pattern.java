class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map1=new HashMap<>();
        Map<String,Character> map2=new HashMap<>();
        String[] parts=s.split(" ");
        if(pattern.length()!=parts.length) return false;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String a=parts[i];
            if(map1.containsKey(c)){
                if(!map1.get(c).equals(a)) return false;
            }
            else{
                map1.put(c,a);
            }
            if(map2.containsKey(a)){
                if(map2.get(a)!=c) return false;
            }
            else{
                map2.put(a,c);
            }
        }
        return true;
    }
}
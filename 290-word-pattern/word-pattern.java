class Solution {
    public boolean wordPattern(String pattern, String s) {
        String parts[]=s.split(" ");
        if(pattern.length()!=parts.length) return false;
        Map<Character,String> m1=new HashMap<>();
        Map<String,Character> m2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char a=pattern.charAt(i);
            String b=parts[i];
            if(m1.containsKey(a)){
                if(!m1.get(a).equals(b)) return false;
            }
            else{
                m1.put(a,b);
            }
            if(m2.containsKey(b)){
                if(m2.get(b)!=a) return false;
            }
            else{
                m2.put(b,a);
            }
        }
        return true;
    }
}
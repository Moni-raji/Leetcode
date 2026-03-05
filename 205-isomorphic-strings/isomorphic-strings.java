class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        /*Map<Character,Character> m1=new HashMap<>();
        Map<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(m1.containsKey(a)){
                if(m1.get(a) != b) return false;
            }
            else{
                m1.put(a,b);
            }
            if(m2.containsKey(b)){
                if(m2.get(b) != a) return false;
            }
            else{
                m2.put(b,a);
            }
        }*/
        int m1[]=new int[256];
        int m2[]=new int[256];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(m1[a] != m2[b]) return false;
            m1[a]=i+1;
            m2[b]=i+1;
        }
        return true;
    }
}
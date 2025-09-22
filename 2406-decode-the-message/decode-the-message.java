class Solution {
    public String decodeMessage(String key, String message) {
        Set<Character> set=new LinkedHashSet<>();
        for(char c:key.toCharArray()){
            if(Character.isLetter(c)) set.add(c);
        }
        Map<Character,Character> map=new HashMap<>();
        List<Character> al=new ArrayList<>(set);
        int c=97;
        for(int i=0;i<26;i++){
            map.put(al.get(i),(char)c++);
        }
        StringBuilder sb=new StringBuilder();
        for(char x:message.toCharArray()){
            if(x==' ') sb.append(" ");
            else{
                sb.append(map.get(x));
            }
        }
        return sb.toString();
    }
}
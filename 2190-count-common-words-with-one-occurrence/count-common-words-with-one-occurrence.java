class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> m1=new HashMap<>();
        Map<String,Integer> m2=new HashMap<>();
        int count=0;
        for(String s:words1) m1.put(s,m1.getOrDefault(s,0)+1);
        for(String s:words2) m2.put(s,m2.getOrDefault(s,0)+1);
        for(String a:words1){
            if(m1.get(a)==1 && m2.getOrDefault(a,0)==1) count++;
        }
        return count;
    }
}
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s:words){
            if(find(allowed,s)) count++;
        }
        return count;
    }
    public boolean find(String a,String b){
        Set<Character> set =new HashSet<>();
        for(char c:a.toCharArray()){
            set.add(c);
        }
        for(char c:b.toCharArray()){
            if(set.add(c)) return false;
        }
        return true;
    }
   
}
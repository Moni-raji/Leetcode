class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(find(words[i],words[j])) count++;
            }
        }
        return count;
    }
    public boolean find(String a,String b){
        Set<Character> s1=new HashSet<>();
        Set<Character> s2=new HashSet<>();
        for(char c:a.toCharArray()) s1.add(c);
        for(char c:b.toCharArray()) s2.add(c);
        return s1.equals(s2);
    }
}
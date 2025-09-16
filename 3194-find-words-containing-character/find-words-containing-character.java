class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        //String y=String.valueOf(x);
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(find(words[i],x)) al.add(i);
        }
        return al;
    }
    public boolean find(String s,char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) return true;
        }
        return false;
    }
}
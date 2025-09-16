class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String y=String.valueOf(x);
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(y)) al.add(i);
        }
        return al;
    }
}
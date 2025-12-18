class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray()) sb.append(arr[c-'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}
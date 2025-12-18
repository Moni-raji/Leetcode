class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for(String s:words){
            String r="";
            for(char c:s.toCharArray()) r=r+arr[c-'a'];
            set.add(r);
        }
        return set.size();
    }
}
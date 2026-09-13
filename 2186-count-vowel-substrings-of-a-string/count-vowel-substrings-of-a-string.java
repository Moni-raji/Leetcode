class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        int n=word.length();
        for(int i=0;i<n;i++){
            Set<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                char c=word.charAt(j);
                if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u') break;
                set.add(c);
                if(set.size()==5) count++;
            }
        }
        return count;
    }
}
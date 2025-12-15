class Solution {
    public int maxDistinct(String s) {
        /*Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        return set.size();*/
        int c[]=new int[26];
        for(char a:s.toCharArray()){
            c[a-'a']++;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            if(c[i]>0) sum++;
        }
        return sum;
    }
}
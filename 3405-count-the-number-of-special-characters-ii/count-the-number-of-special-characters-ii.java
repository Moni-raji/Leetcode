class Solution {
    public int numberOfSpecialChars(String word) {
        int lastlow[]=new int[26];
        int firstup[]=new int[26];
        Arrays.fill(lastlow,-1);
        Arrays.fill(firstup,Integer.MAX_VALUE);
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                lastlow[c-'a']=i;
            }
            else{
                firstup[c-'A']=Math.min(firstup[c-'A'],i);
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(lastlow[i]!=-1 && firstup[i]!=Integer.MAX_VALUE && lastlow[i]<firstup[i]){
                count++;
            }
        }
        return count;
    }
}
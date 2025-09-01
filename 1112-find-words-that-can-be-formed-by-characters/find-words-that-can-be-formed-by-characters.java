class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        for(String x:words){
            if(find(x,chars)) sum+=x.length();
        }
        return sum;
    }
    public boolean find(String s,String t){
        int arr[]=new int[26];
        for(char c:t.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(arr[c-'a']==0) return false;
            else{
                arr[c-'a']--;
            }
        }
        return true;
    }
}
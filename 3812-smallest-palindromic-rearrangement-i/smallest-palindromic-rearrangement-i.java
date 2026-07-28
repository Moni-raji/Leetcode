class Solution {
    public String smallestPalindrome(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        char mid=' ';
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]%2 != 0){
                mid=(char)(i+'a');
            }
            for(int j=0;j<freq[i]/2;j++){
                sb.append((char)(i+'a'));
            }
        }
        StringBuilder a=new StringBuilder(sb);
        a.reverse();
        String r="";
        if(mid==' '){
            r=sb.toString()+a.toString();
        }
        else{
            r=sb.toString()+mid+a.toString();
        }
        return r;
    }
}
class Solution {
    public String reverseVowels(String s) {
        char c[]=s.toCharArray();
        int left=0;
        int right=c.length-1;
        while(left<=right){
            if(!isvowel(c[left])) left++;
            else if(!isvowel(c[right])) right--;
            else{
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
        }
        String result=String.valueOf(c);
        return result;
    }
    public static boolean isvowel(char c){
        c=Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
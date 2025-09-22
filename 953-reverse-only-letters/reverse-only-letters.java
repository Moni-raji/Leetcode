class Solution {
    public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;
        char c[]=s.toCharArray();
        while(left<right){
            if(Character.isLetter(c[left]) && Character.isLetter(c[right])){
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
            else if(!Character.isLetter(c[left])){
                left++;
            }
            else{
                right--;
            }
        }
        String result=new String(c);
        return result;
    }
}
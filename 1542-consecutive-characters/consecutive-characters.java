class Solution {
    public int maxPower(String s) {
        int a=s.charAt(0)-'a';
        int prev=Integer.MIN_VALUE;
        int count=0;
        int i=0;
        int len=s.length();
        while(i<len){
            if((s.charAt(i)-'a') == a) count++;
            else{
                if(count>prev) prev=count;
                count=1;
                a=s.charAt(i)-'a';
            }
            i++;
        }
        if(count>prev) prev=count;
        return prev;
    }
}
class Solution {
    public boolean checkZeroOnes(String s) {
        int one=find(s,'1');
        int zero=find(s,'0');
        if(one>zero) return true;
        return false;
    }
    public int find(String s,char a){
        int count=0;
        int prev=Integer.MIN_VALUE;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==a) count++;
            else{
                if(count>prev) prev=count;
                count=0;
            }
            i++;
        }
        if(count>prev) prev=count;
        return prev;
    }
}
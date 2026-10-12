class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int a=0;
        for(char c:s.toCharArray()){
            if(c=='(') a++;
            if(c==')' && a==0) count++;
            else if(c==')' && a>0) a--;
        }
        count+=a;
        return count;
    }
}
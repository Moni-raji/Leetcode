class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int a=0;
        for(char c:s.toCharArray()){
            if(c=='R') a++;
            else if(c=='L') a--;
            if(a==0) count++;
        }
        return count;
    }
}
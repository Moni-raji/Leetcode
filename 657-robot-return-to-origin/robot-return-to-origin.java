class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(char c:moves.toCharArray()){
            if(c=='L') l++;
            else if(c=='R') r++;
            else if(c=='U') u++;
            else d++;
        }
        int result=Math.abs(l-r)+Math.abs(u-d);
        return result==0;
    }
}
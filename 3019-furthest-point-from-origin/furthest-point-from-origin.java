class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int a=0,l=0,r=0;
        for(char c:moves.toCharArray()){
            if(c=='L') l++;
            else if(c=='R') r++;
            else a++;
        }
        return Math.abs(l-r)+a;
        
    }
}
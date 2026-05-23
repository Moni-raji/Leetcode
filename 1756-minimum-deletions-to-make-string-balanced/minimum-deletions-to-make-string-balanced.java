class Solution {
    public int minimumDeletions(String s) {
        int cb=0;
        int del=0;
        for(char c:s.toCharArray()){
            if(c=='b') cb++;
            else{
                del=Math.min(del+1 , cb);
            }
        }
        return del;
    }
}
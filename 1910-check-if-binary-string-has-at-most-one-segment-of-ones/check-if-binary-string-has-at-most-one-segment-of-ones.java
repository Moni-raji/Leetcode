class Solution {
    public boolean checkOnesSegment(String s) {
        boolean r=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(r) return false;
            }
            else{
                r=true;
            }
        }
        return true;
        
    }
}
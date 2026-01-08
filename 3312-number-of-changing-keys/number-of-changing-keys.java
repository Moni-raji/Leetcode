class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        s=s.toLowerCase();
        //char c=s.charAt(0);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != s.charAt(i+1)) count++;
        }
        return count;
    }
}
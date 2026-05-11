class Solution {
    public boolean canAliceWin(int[] nums) {
        int s1=0;
        int s2=0;
        for(int a:nums){
            if(a>=0 && a<=9) s1+=a;
            else s2+=a;
        }
        if(s1==s2) return false;
        return true;
    }
}
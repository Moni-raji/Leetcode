class Solution {
    public int minBitFlips(int start, int goal) {
        int a=start^goal;
        String s=Integer.toBinaryString(a);
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}
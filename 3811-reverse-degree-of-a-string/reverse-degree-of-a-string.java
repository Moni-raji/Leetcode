class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=1;
        for(char c:s.toCharArray()){
            int a='z'-c+1;
            sum+=a*i;
            i++;
        }
        return sum;
    }
}
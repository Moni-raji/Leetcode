class Solution {
    public String largestPalindromic(String num) {
        int freq[]=new int[10];
        for(char c:num.toCharArray()){
            freq[c-'0']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=9;i>=0;i--){
            int count=freq[i]/2;
            if (sb.length() == 0 && i == 0) {
                continue;
            }
            for(int j=0;j<count;j++){
                    sb.append(i);
            }
        }
        StringBuilder mid = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            if (freq[i] % 2 == 1) {
                mid.append(i);
                break;
            }
        }
        if (sb.length() == 0 && mid.length() == 0) {
            return "0";
        }
        String right = new StringBuilder(sb).reverse().toString();
        return sb.toString() + mid.toString() + right;

    }
}
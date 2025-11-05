class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1) return s;
        int max=0;
        String r="";
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<n;j++){
                sb.append(s.charAt(j));
                String curr=sb.toString();
                if(ispalindrome(curr)){
                    int len=j-i+1;
                    if(len>max){
                        max=len;
                        r=curr;
                    }
                }
            }
        }
        return r;
    }
    public boolean ispalindrome(String s){
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
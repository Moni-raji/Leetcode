class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        dp[0]=1;
        if(s.charAt(0)!='0'){
            dp[1]=1;
        }
        for(int i=2;i<=n;i++){
            int a=s.charAt(i-1)-'0';
            if(a>=1 && a<=9) dp[i]+=dp[i-1];
            int b=s.charAt(i-2)-'0';
            int c=b*10+a;
            if(c>=10 && c<=26) dp[i]+=dp[i-2];
        }
        return dp[n];
    }
}
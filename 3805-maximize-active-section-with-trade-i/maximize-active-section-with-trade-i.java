class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int curr=0;
        for(char c:s.toCharArray()){
            if(c=='1') curr++;
        }
        int n=s.length();
        String a='1'+s+'1';
        int r[][]=new int[n+2][2];
        int i=0;
        int k=0;
        while(i<a.length()){
            char c=a.charAt(i);
            int j=i;
            while(j<a.length() && a.charAt(j)==c) j++;
            r[k][0]=c-'0';
            r[k][1]=j-i;
            i=j;
            k++;
        }
        int ans=curr;
        for(int j=1;j<k-1;j++){
            if(r[j][0]==1 && r[j-1][0]==0 && r[j+1][0]==0){
                int left=r[j-1][1];
                int right=r[j+1][1];
                int b=curr+left+right;
                ans=Math.max(ans,b);
            }
        }
        return ans;

    }
}
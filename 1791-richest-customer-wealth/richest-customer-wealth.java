class Solution {
    public int maximumWealth(int[][] accounts) {
        int a=accounts.length;
        int b=accounts[0].length;
        int mw=0;
        int i=0;
        while(i<a){
            int sum=0;
            for(int j=0;j<b;j++) sum+=accounts[i][j];
            if(sum>mw){
                mw=sum;
            }
            i++;
        }
        return mw;
    }
}
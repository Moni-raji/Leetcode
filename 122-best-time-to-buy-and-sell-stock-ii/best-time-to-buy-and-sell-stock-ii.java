class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2) return 0;
        int min=prices[0];
        int sum=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min) min=prices[i];
            else{
                int profit=prices[i]-min;
                sum+=profit;
                min=prices[i];
            }
        }
        return sum;
    }
}
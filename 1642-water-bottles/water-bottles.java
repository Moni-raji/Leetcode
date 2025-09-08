class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        int a=numBottles;
        while(a>=numExchange){
            int x=a/numExchange;
            count+=x;
            int y=a%numExchange;
            a=x+y;
        }
        return count;
    }
}
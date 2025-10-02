class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=0;
        int e=0;
        while(numBottles>0){
            count+=numBottles;
            e+=numBottles;
            numBottles=0;
            if(e>=numExchange){
                e-=numExchange;
                numExchange++;
                numBottles++;
            }
            else break;
        }
        return count;
    }
}
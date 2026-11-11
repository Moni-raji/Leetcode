class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int steps=0;
        int n=tickets.length;
        int i=0;
        while(tickets[k]!=0){
            i=i%n;
            if(tickets[i]!=0){
                tickets[i]--;
                steps++;
            }
            i++;
        }
        return steps;
    }
}
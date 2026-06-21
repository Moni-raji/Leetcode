class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int sum=0;
        if(costs[0]>coins) return 0;
        for(int a:costs){
            sum+=a;
            if(sum>coins) break;
            count++;
        }
        return count;
    }
}
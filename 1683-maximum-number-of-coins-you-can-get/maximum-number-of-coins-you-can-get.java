class Solution {
    public int maxCoins(int[] piles) {
        int sum=0;
        int left=0;
        int right=piles.length-2;
        Arrays.sort(piles);
        while(left<right){
            sum+=piles[right];
            left++;
            right-=2;
        }
        return sum;
    }
}
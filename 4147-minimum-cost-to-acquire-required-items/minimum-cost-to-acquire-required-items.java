class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth,
                            int need1, int need2) {

        long a = (long) need1 * cost1
               + (long) need2 * cost2;

        int min = Math.min(need1, need2);
        int max = Math.max(need1, need2);

        long b = (long) min * costBoth;

        if(need1 > need2) {
            b += (long)(need1 - need2) * cost1;
        }
        else {
            b += (long)(need2 - need1) * cost2;
        }

        long c = (long) max * costBoth;

        return Math.min(a, Math.min(b, c));
    }
}

class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        long even = 1;
        long odd = 0;
        long count = 0;
        int parity = 0;
        for (int num : arr) {
            parity = (parity + num) % 2;
            if (parity == 1) {
                count = (count + even) % MOD;
                odd++;
            }
            else {
                count = (count + odd) % MOD;
                even++;
            }
        }
        return (int) count;
    }
}
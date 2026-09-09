class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long start = 1;
        int digits = 1;

        while (start <= n) {
            long end = Math.min(n, start * 10 - 1);

            long count = end - start + 1;
            long commas = (digits - 1) / 3;

            ans += count * commas;

            start *= 10;
            digits++;
        }

        return ans;
    }
}
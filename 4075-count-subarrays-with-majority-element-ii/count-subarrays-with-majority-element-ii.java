class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int[] pre = new int[2 * n + 1];
        pre[n] = 1;

        long presum = 0;
        int cnt = n;
        long res = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == target) {
                presum += pre[cnt];
                cnt++;
                pre[cnt]++;
            } else {
                cnt--;
                presum -= pre[cnt];
                pre[cnt]++;
            }

            res += presum;
        }

        return res;
    }
}
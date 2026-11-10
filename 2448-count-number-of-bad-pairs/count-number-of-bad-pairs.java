class Solution {
    public long countBadPairs(int[] nums) {
        long n=nums.length;
        long good=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int diff=i-nums[i];
            good+=map.getOrDefault(diff,0);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        long total=n*(n-1)/2;
        return total-good;
    }
}
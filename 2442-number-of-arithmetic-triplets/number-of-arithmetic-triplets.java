class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int count=0;
        for(int a:nums){
            if(set.contains(a-diff) && set.contains(a-2*diff)) count++;
        }
        return count;
    }

}
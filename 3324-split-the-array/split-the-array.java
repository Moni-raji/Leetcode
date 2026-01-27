class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!s1.add(nums[i]) && !s2.add(nums[i])) return false;
        }
        return true;
    }
}
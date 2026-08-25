class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        int result=k;
        while(set.contains(result)){
            result+=k;
        }
        return result;
    }
}
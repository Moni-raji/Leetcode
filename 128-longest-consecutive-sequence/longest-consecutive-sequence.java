class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        int max=0;
        for(int a:set){
            if(!set.contains(a-1)){
                int curr=a;
                int len=1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                max=Math.max(max,len);
            }
        }
        return max;
    }
}
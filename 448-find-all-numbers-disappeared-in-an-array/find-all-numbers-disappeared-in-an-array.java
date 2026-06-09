class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> al=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) al.add(i);
        }
        return al;
    }
}
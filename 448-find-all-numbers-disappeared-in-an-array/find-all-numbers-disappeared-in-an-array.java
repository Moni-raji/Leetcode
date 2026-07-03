class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> al=new ArrayList<>();
        /*Set<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) al.add(i);
        }*/

        //refer code note
        for(int i=0;i<nums.length;i++){
            int j=Math.abs(nums[i])-1;
            if(nums[j]>0){
            nums[j]=-nums[j];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) al.add(i+1);
        }
        return al;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*boolean found=false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>=2){
                found=true;
            }
        }
        return found;*/
        Set<Integer> set=new HashSet<>();
        for(int a:nums){
            if(set.contains(a)) return true;
            set.add(a);
        }
        return false;

    }
}
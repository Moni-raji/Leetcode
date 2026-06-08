class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean found=false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>=2){
                found=true;
            }
        }
        return found;
    }
}
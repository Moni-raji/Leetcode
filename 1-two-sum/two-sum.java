class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target) return new int[]{i,j};
            }
        }*/
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(map.containsKey(a)) return new int[]{map.get(a),i};
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
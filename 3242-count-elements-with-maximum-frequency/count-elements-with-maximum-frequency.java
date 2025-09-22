class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int a:map.values()){
            if(a>max) max=a;
        }
        int sum=0;
        for(int a:map.values()){
            if(a==max) sum+=a;
        }
        return sum;
    }
}
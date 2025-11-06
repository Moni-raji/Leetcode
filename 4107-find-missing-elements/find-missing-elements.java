class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> al=new ArrayList<>();
        int a=nums[0];
        int i=0;
        while(i<nums.length){
            if(nums[i]==a){
                i++;
            }
            else{
                al.add(a);
            }
            a++;
        }
        return al;
    }
}
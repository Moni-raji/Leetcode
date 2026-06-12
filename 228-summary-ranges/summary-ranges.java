class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        int i=0;
        List<String> al=new ArrayList<>();
        while(i<n){
            int start=nums[i];
            while(i+1<n && nums[i+1]==nums[i]+1){
                i++;
            }
            int end=nums[i];
            if(start==end){
                al.add(String.valueOf(start));
            }
            else{
                al.add(start+"->"+end);
            }
            i++;
        }
        return al;
    }
}
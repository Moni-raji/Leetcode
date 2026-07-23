class Solution {
    public int lengthOfLIS(int[] nums) {
        int len=1;
        List<Integer> al=new ArrayList<>();
        al.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>al.get(al.size()-1)){
                al.add(nums[i]);
                len++;
            }
            else{
                int j=search(al,nums[i]);
                al.set(j,nums[i]);
            }
        }
        return len;
    }
    public int search(List<Integer> al,int n){
        int left=0;
        int right=al.size()-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(al.get(mid)>=n) right=mid;
            else left=mid+1;
        }
        return left;
    }
}
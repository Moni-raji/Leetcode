class Solution {
    public int maxOperations(int[] nums) {
        int len=nums.length-2;
        int count=1;
        int a=0,b=1;
        int sum=nums[a]+nums[b];
        while(len>1){
            a+=2;
            b+=2;
            if(nums[a]+nums[b] == sum){
                count++;
            }
            else{
                break;
            }
            len-=2;
        }
        return count;
    }
}
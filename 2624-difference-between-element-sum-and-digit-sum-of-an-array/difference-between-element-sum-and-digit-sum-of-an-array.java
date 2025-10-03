class Solution {
    public int differenceOfSum(int[] nums) {
       int sum=0;
       int sum2=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        sum2+=find(nums[i]);
       } 
       return Math.abs(sum-sum2);
       
    }
    public int find(int a){
        int x=0;
        while(a!=0){
            x+=a%10;
            a/=10;
        }
        return x;
    }
}
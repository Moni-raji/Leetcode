class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            nums[i]=sumOfDigits(nums[i]);
            if(nums[i]<min) min=nums[i];
        }
        return min;

    }
    public int sumOfDigits(int a){
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}
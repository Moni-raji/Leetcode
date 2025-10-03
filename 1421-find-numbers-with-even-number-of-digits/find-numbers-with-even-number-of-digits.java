class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(find(nums[i])%2==0) count++;
        }
        return count;
    }
    public int find(int a){
        int c=0;
        while(a!=0){
            c++;
            a/=10;
        }
        return c;
    }
}
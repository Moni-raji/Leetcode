class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int r[]=new int[n];
        long sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            r[i]=gcd(nums[i],max);
        }
        Arrays.sort(r);
        int left=0;
        int right=n-1;
        while(left<right){
            sum+=gcd(r[left],r[right]);
            left++;
            right--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
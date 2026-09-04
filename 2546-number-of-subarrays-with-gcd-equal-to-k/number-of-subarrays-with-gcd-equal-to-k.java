class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n=nums.length;
        if(n==1 && nums[0]!=k) return 0;
        int count=0;
        for(int i=0;i<n;i++){
            int g=0;
            for(int j=i;j<n;j++){
                g=gcd(g,nums[j]);
                if(g==k) count++;
            }
        }
        return count;
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
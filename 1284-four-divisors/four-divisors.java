class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=divisor(nums[i]);
        }
        return sum;
    }
    public int divisor(int n){
        /*if(n<=5) return 0;
        int count=0;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
                count++;
            }
        }
        if(count==3) return sum+n;
        return 0;*/

        int sum=0;
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                sum+=i;
                count++;
                if(i!= n/i){
                    sum+=(n/i);
                    count++;
                }
            }
        }
        return count==4?sum:0;
    }
}
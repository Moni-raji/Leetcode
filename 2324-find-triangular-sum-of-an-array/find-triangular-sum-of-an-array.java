class Solution {
    public int triangularSum(int[] nums) {
        /*StringBuilder sb=new StringBuilder();
        String s="";
        for(int a:nums){
            s+=String.valueOf(a);
        }
        int i=1;
        while(s.length()>1){
            int sum=(s.charAt(i)-'0')+(s.charAt(i-1)-'0');
            sum=sum%10;
            sb.append(sum);
            i++;
            if(i>=s.length()){
                i=1;
                s=sb.toString();
                sb.setLength(0);
            }
        }
        return Integer.parseInt(s);*/

        int n=nums.length;
        while(n>1){
            for(int i=0;i<n-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            n--;
        }
        return nums[0];
    }
}
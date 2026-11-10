class Solution {
    public int countNicePairs(int[] nums) {
        int n=nums.length;
        int count=0;
        int MOD=1000000007;
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            int diff=a-rev(a);
            count = (count+map.getOrDefault(diff,0))%MOD;
            map.put(diff,map.getOrDefault(diff,0)+1);
        } 
        return count;
    }
    public int rev(int a){
        int rev=0;
        while(a!=0){
            rev=rev*10+(a%10);
            a/=10;
        }
        return rev;
    }
}
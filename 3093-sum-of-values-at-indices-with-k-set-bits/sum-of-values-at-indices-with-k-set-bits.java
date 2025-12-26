class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            String s=Integer.toBinaryString(i);
            if(count(s)==k) sum+=nums.get(i);
        }
        return sum;
    }
    public int count(String s){
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}
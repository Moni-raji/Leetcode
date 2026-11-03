class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int a:nums){
            max=Math.max(max,a);
        }
        int total=0;
        for(int a:nums){
            if(a!=max){
                total+=(max-a);
            }
        }
        return total;
    }
}
class Solution {
    public int largestInteger(int[] nums, int k) {
        int freq[]=new int[51];
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            boolean seen[]=new boolean[51];
            for(int j=i;j<i+k;j++){
                seen[nums[j]]=true;
            }
            for(int x=0;x<51;x++){
                if(seen[x]){
                    freq[x]++;
                }
            }
        }
        for(int i=50;i>=0;i--){
            if(freq[i]==1) return i;
        }
        return -1;
    }
}
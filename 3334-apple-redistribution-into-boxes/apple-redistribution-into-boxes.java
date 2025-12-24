class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int a:apple){
            sum+=a;
        }
        Arrays.sort(capacity);
        int count=0;
        int i=capacity.length-1;
        while(sum>0){
            sum-=capacity[i];
            count++;
            i--;
        }
        return count;
    }
}
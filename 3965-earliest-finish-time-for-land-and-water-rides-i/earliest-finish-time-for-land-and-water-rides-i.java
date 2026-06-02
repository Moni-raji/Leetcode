class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        int n=landStartTime.length;
        int m=waterStartTime.length;
        for(int i=0;i<n;i++){
            int sum=landStartTime[i]+landDuration[i];
            for(int j=0;j<m;j++){
                int b=Math.max(sum,waterStartTime[j]);
                min=Math.min(min,b+waterDuration[j]);  
            }
        }
        for(int i=0;i<m;i++){
            int sum=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<n;j++){
                int b=Math.max(sum,landStartTime[j]);
                min=Math.min(min,b+landDuration[j]);   
            }
        }
        return min;
    }
}
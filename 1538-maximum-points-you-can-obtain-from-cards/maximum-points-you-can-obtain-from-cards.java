class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        for(int a=0;a<k;a++){
            sum+=cardPoints[a];
        }
        int max=sum;
        int j=n-1;
        int i=k-1;
        while(i>=0){
            sum+=cardPoints[j--];
            sum-=cardPoints[i--];
            max=Math.max(max,sum);
        }
        return max;
    }
}
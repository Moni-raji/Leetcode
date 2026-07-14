class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int total=0;
        for(int i=0;i<n-1;i++){
            int a=points[i+1][0];
            int b=points[i][0];
            int x=Math.abs(a-b);
            int c=points[i+1][1];
            int d=points[i][1];
            int y=Math.abs(d-c);
            total+=Math.max(x,y);
        }
        return total;
    }
}
class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]) return Integer.compare(b[1],a[1]);
            return Integer.compare(a[0],b[0]);
        });
        int n=arr.length;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i][1]<=max) continue;
            count++;
            max=arr[i][1];
        }
        return count;
    }
}
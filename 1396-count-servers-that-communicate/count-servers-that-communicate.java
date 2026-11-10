class Solution {
    public int countServers(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int a[]=new int[r];
        int b[]=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    a[i]++;
                    b[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(a[i]>1 || b[j]>1) count++;
                }
            }
        }
        return count;
    }
}
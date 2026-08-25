class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1) fresh++;
                else if(grid[i][j]==2) q.offer(new int[]{i,j});
            }
        }
        int count=0;
        int dir[][]={{-1,0},{0,-1},{0,1},{1,0}};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
            int a[]=q.poll();
            int row=a[0];
            int col=a[1];
            for(int d[]:dir){
                int nr=row+d[0];
                int nc=col+d[1];
                if(nr>=0 && nr<r && nc>=0 && nc<c){
                    if(grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            }
            count++;
        }
        if(fresh!=0) return -1;
        return count;
    }
}
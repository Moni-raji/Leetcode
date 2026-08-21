class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean visited[][]=new boolean[r][c];
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    Queue<int[]> q=new LinkedList<>();
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                    while(!q.isEmpty()){
                        int curr[]=q.poll();
                        int row=curr[0];
                        int col=curr[1];
                        for(int[] d:dir){
                            int nr=row+d[0];
                            int nc=col+d[1];
                            if(nr>=0 && nr<r && nc>=0 && nc<c){
                                if(grid[nr][nc]=='1' && !visited[nr][nc]){
                                    q.offer(new int[]{nr,nc});
                                    visited[nr][nc]=true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
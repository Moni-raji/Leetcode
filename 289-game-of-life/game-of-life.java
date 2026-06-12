class Solution {
    public void gameOfLife(int[][] board) {
        int x[]={-1,-1,-1,0,0,1,1,1};
        int y[]={-1,0,1,-1,1,-1,0,1};
        int r=board.length;
        int c=board[0].length;
        int temp[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[i][j]=board[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int live=0;
                for(int k=0;k<8;k++){
                    int nx=x[k]+i;
                    int ny=y[k]+j;
                    if(nx>=0 && nx<r && ny>=0 && ny<c){
                        if(temp[nx][ny]==1) live++;
                    }
                }
                if(temp[i][j]==1){
                    if(live<2 || live>3) board[i][j]=0;
                }
                else{
                    if(live==3) board[i][j]=1;
                }
            }
        }
    }
}
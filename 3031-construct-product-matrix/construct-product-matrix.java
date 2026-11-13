class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int arr[][]=new int[n][m];
        arr[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                else if(j==0){
                    arr[i][j]=(int)((arr[i-1][m-1] * 1L * grid[i-1][m-1]) % 12345);
                }
                else{
                    arr[i][j]=(int)((arr[i][j-1] * 1L * grid[i][j-1]) % 12345);
                }
            }
        }
        long suff=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                arr[i][j]=(int)(arr[i][j]*suff)%12345;
                suff=(suff*grid[i][j])%12345;
            }
        }
        return arr;
    }
}
class Solution {
    public int uniquePaths(int r, int c) {
        int arr[][]=new int[r][c];
        for(int i=0;i<c;i++){
            arr[0][i]=1;
        }
        for(int i=0;i<r;i++){
            arr[i][0]=1;
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[r-1][c-1];
    }
}
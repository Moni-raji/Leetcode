class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int x=mat.length;
        int y=mat[0].length;
        if(x*y != r*c) return mat;
        int arr[][]=new int[r][c];
        int count=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[count/c][count%c]=mat[i][j];
                count++;
            }
        }
        return arr;
    }
}
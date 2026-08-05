class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int c=original.length;
        if(m*n != c) return new int[][]{};
        int arr[][]=new int[m][n];
        int count=0;
        for(int i=0;i<c;i++){
            arr[count/n][count%n]=original[i];
            count++;
        }
        return arr;
    }
}
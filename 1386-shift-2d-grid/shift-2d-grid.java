class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k=k%total;
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int oldI=i*n+j;
                int newI=(oldI+k)%total;
                int row=newI/n;
                int col=newI%n;
                arr[row][col]=grid[i][j];
            }
        }
        List<List<Integer>> r=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<n;j++){
                a.add(arr[i][j]);
            }
            r.add(a);
        }
        return r;
    }
}
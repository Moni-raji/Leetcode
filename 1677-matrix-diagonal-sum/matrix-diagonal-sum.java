class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int left=0;
        int right=n-1;
        int i=0;
        int sum=0;
        while(left<n && right>=0 && i<n){
            sum+=mat[i][left];
            if(left!=right){
            sum+=mat[i][right];
            }
            left++;
            right--;
            i++;
        }
        return sum;
    }
}
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean rm[][]=new boolean[r][c];
        boolean cm[][]=new boolean[r][c];
        for(int i=0;i<r;i++){
            int mini=0;
            for(int j=1;j<c;j++){
                if(matrix[i][j]<matrix[i][mini]){
                    mini=j;
                }
            }
            rm[i][mini]=true;
        }
        for(int j=0;j<c;j++){
            int maxi=0;
            for(int i=1;i<r;i++){
                if(matrix[i][j]>matrix[maxi][j]){
                    maxi=i;
                }
            }
            cm[maxi][j]=true;
        }
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rm[i][j] && cm[i][j]) al.add(matrix[i][j]);
            }
        }
        return al;
    }
}
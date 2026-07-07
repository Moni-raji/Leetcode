class Solution {
    public int numSpecial(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==0) continue;
                boolean f=true;
                for(int k=0;k<c;k++){
                    if(arr[i][k]==1 && k!=j){
                        f=false;
                    }
                }
                if(!f) continue;
                for(int k=0;k<r;k++){
                    if(arr[k][j]==1 && k!=i){
                        f=false;
                    }
                }
                if(f) count++;
            }
        }
        return count;
    }
}
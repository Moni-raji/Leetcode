class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m=score.length;
        for(int i=0;i<m-1;i++){
            int max=i;
            for(int j=i+1;j<m;j++){
                if(score[j][k]>score[max][k]) max=j;
            }
            if(max!=i){
                int temp[]=score[i];
                score[i]=score[max];
                score[max]=temp;
            }
        }
        return score;
    }
}
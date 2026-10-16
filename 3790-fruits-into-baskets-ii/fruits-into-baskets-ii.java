class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=baskets.length;
        boolean placed[]=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!placed[j] && baskets[j]>=fruits[i]){
                    placed[j]=true;
                    break;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(!placed[i]) count++;
        }
        return count;
    }
}
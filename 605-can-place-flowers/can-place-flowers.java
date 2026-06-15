class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s=flowerbed.length;
        int count=0;
        for(int i=0;i<s;i++){
            if(flowerbed[i]==1) continue;
            boolean left=(i==0) || flowerbed[i-1]==0;
            boolean right=(i==s-1) || flowerbed[i+1]==0;
            if(left && right){
                flowerbed[i]=1;
                count++;
            }
            if(count>=n) return true;
        }
        return count>=n;
    }
}
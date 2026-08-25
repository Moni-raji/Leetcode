class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        for(int i=0;i<r;i++){
            int left=0;
            int right=c-1;
            while(left<=right){
                int temp=image[i][left];
                image[i][left] = 1 - image[i][right];
                image[i][right] = 1 - temp;
                left++;
                right--;
            }
        }
        
        return image;
    }
}
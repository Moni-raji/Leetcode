class Solution {
    public int trap(int[] height) {
        int n=height.length;
        /*int left[]=new int[n];
        left[0]=height[0];
        int right[]=new int[n];
        right[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int water=0;
        for(int i=0;i<n;i++){
            water+=(Math.min(left[i],right[i])-height[i]);
        }
        return water;*/
        int total=0;
        int left=0,right=n-1;
        int leftm=0,rightm=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(leftm>height[left]) total+=leftm-height[left];
                else leftm=height[left];
                left++;
            }
            else{
                if(rightm>height[right]) total+=rightm-height[right];
                else rightm=height[right];
                right--;
            }
        }
        return total;
    }
}
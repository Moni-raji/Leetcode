class Solution {
    public int mySqrt(int x) {
        /*if(x==0 || x==1) return x;
        int left=1;
        int right=x/2;
        int r=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            long sq=(long)mid*mid;
            if(sq==x) return mid;
            else if(sq<x){
                r=mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        return r;*/
        if (x == 0) return 0;

        long r = x; // Start with a rough guess (must use long to avoid overflow)
        while (r * r > x) {
            r = (r + x / r) / 2; // Newton's update formula
        }

        return (int) r;
    }
}
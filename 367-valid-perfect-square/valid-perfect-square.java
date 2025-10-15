class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int left=1,right=num/2;
        while(left<=right){
            int mid=left+(right-left)/2;
            long a=(long)mid*mid;
            if(a==num) return true;
            else if(a<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}
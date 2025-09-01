class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target> x+y) return false;
        if(target==0) return true;
        if(x==0 || y==0){
            return target == x || target == y || target == x+y;
        }
        return target%gcd(x,y)==0;
    }
    public int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }
}
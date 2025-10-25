class Solution {
    public int totalMoney(int n) {
        int m=1;
        int sum=0;
        int count=0;
        while(count<n){
            int a=m;
            for(int i=a;i<a+7 && count<n;i++){
                sum+=i;
                count++;
            }
            m++;
        }
        return sum;
    }
}
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int sum=0;
        for(int x:rolls){
            sum+=x;
        }
        int rem=mean*(m+n)-sum;
        if(rem<n || rem>6*n) return new int[]{};
        int base=rem/n;
        int e=rem%n;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=base;
        }
        for(int i=0;i<e;i++){
            arr[i]++;
        }
        return arr;
    }
}
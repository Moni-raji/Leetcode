class Solution {
    public int totalWaviness(int num1, int num2) {
        int result=0;
        for(int i=num1;i<=num2;i++){
            result+=count(i);
        }
        return result;
    }
    public int count(int n){
        String s=String.valueOf(n);
        int count=0;
        if(s.length()<3) return 0;
        for(int i=1;i<s.length()-1;i++){
            int l=s.charAt(i-1);
            int curr=s.charAt(i);
            int r=s.charAt(i+1);
            if(curr>l && curr>r) count++;
            else if(curr<l && curr<r) count++;
        }
        return count;
    }
}
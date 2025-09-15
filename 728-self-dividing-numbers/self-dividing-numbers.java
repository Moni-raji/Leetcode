class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isself(i)) al.add(i);
        }
        return al;
    }
    public boolean isself(int n){
        int a=n;
        while(n!=0){
            int b=n%10;
            if(b==0 || a%b!=0) return false;
            n/=10;
        }
        return true;
    }
}
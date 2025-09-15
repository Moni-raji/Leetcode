class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> m=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> al=new ArrayList<>();
            for(int j=1;j<=i;j++){
                al.add(ncr(i-1,j-1));
            }
            m.add(al);
        }
        return m;
    }
    public int ncr(int n,int r){
        int result=1;
        for(int i=0;i<r;i++){
            result*=(n-i);
            result/=(i+1);
        }
        return result;
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            al.add(ncr(rowIndex,i));
        }
        return al;
    }
    public int ncr(int n,int r){
        long result=1;
        for(int i=0;i<r;i++){
            result*=(n-i);
            result/=(i+1);
        }
        return (int)result;
    }
}
class Solution {
    public int[] countBits(int n) {
        String[] arr=new String[n+1];
        for(int i=0;i<=n;i++){
            String s=Integer.toBinaryString(i);
            arr[i]=s;
        }
        int r[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0;
            for(char c:arr[i].toCharArray()){
                if(c=='1') count++;
            }
            r[i]=count;
        }
        return r;
    }
}
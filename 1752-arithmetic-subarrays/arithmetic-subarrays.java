class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> al=new ArrayList<>();
        for(int i=0;i<l.length;i++){
                int n=r[i]-l[i]+1;
                int arr[]=new int[n];
                for(int k=0;k<n;k++){
                    arr[k]=nums[k+l[i]];
                }
                Arrays.sort(arr);
                int diff=arr[1]-arr[0];
                boolean isarithmetic=true;
                for(int a=1;a<arr.length-1;a++){
                    if(arr[a+1]-arr[a] != diff){
                        isarithmetic=false;
                        break;
                    }
                }
                al.add(isarithmetic);
        }
        return al;
    }
}
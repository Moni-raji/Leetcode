class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int pos=0;
        int neg=1;
        for(int a:nums){
            if(a>0){
                arr[pos]=a;
                pos+=2;
            } 
            else if(a<0){
                arr[neg]=a;
                neg+=2;
            }
        }
        return arr;
    }
}
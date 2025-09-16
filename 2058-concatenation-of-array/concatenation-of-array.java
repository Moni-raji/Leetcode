class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        int n=a*2;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(i>=a){
                arr[i]=nums[i-a];
            }
            else{
                arr[i]=nums[i];
            }
        }
        return arr;
    }
}
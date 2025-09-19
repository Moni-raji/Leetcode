class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int i=0;
        while(i<k){
            int a=find(nums);
            nums[a]*=multiplier;
            i++;
        }
        return nums;
        
    }
    public int find(int[] arr){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}
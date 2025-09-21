class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        List<Integer> al=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>=0) al.add(nums[i]);
            else if(nums[i]<0) al2.add(nums[i]);
        }
        int j=0;
        for(int k=0;k<n;k+=2){
            arr[k]=al.get(j);
            arr[k+1]=al2.get(j);
            j++;
        }
        return arr;
    }
}
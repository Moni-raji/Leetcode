class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> al=new ArrayList<>();
        //Arrays.sort(nums);
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) al.add(i);
        }
        return al;
    }
    public int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
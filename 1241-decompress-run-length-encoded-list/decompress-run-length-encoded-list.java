class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int a=nums[i+1];
            for(int j=0;j<nums[i];j++) al.add(a);
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}
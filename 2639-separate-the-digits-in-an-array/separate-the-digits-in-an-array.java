class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> al=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
           String s=String.valueOf(nums[i]);
           String parts[]=s.split("");
           for(String b:parts){
            al.add(Integer.parseInt(b));
           }
        }
        int arr[]=new int[al.size()];
        int j=0;
        for(int a:al){
            arr[j++]=a;
        }
        return arr;
    }
}
class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int a=s.length();
        int nums[]=new int[a];
        int i=0;
        while(n!=0){
            nums[i]=n%10;
            n/=10;
            i++;
        }
        Arrays.sort(nums);
        return nums[a-1]*nums[a-2];
    }
}
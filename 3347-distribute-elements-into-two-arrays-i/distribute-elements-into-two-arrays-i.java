class Solution {
    public int[] resultArray(int[] nums) {
        /*int a1=0;
        int a2=1;
        if(nums.length<=2) return nums;
        for(int i=2;i<nums.length;i++){
            if(nums[a1]>nums[a2]){
                int temp=nums[a2];
                nums[a2]=nums[i];
                nums[i]=temp;
                a1++;
                a2++;
            }
            else if(nums[a2]>nums[a1]){
                a2++;
            }
        }*/
        List<Integer> al=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        al.add(nums[0]);
        al2.add(nums[1]);
        int a1=nums[0];
        int a2=nums[1];
        for(int i=2;i<nums.length;i++){
            if(a1>a2){
                al.add(nums[i]);
                a1=nums[i];
            }
            else{
                al2.add(nums[i]);
                a2=nums[i];
            }
        }
        int r[]=new int[nums.length];
        int i=0;
        for(int a:al){
            r[i++]=a;
        }
        for(int b:al2){
            r[i++]=b;
        }
        return r;
    }
}
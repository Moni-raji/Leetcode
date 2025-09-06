class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int a:nums){
            set.add(a);
        }
        int arr[]=new int[set.size()];
        int i=0;
        for(int a:set){
            arr[i++]=a;
        }
        if(arr.length<3) return arr[arr.length-1];
        return arr[arr.length-3];
    }
}
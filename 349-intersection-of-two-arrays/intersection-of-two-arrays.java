class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int a:nums1){
            set.add(a);
        }
        Set<Integer> result=new HashSet<>();
        for(int a:nums2){
            if(set.contains(a)){
                result.add(a);
            }
        }
        int r[]=new int[result.size()];
        int i=0;
        for(int b:result){
            r[i++]=b;
        }
        return r;
    }
}
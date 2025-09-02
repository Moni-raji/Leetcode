class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    al.add(nums1[i]);
                    nums2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int r[]=new int[al.size()];
        int i=0;
        for(int a:al){
            r[i++]=a;
        }
        return r;
    }
}
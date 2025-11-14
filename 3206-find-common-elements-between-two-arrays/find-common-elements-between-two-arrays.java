class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int a:nums1) s1.add(a);
        for(int b:nums2) s2.add(b);
        int c=0, d=0;
        for(int a:nums1){
            if(s2.contains(a)) c++;
        }
        for(int b:nums2){
            if(s1.contains(b)) d++;
        }
        return new int[]{c,d};
    }
}
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> set=new HashSet<>();
        for(int a:arr1){
            String s=String.valueOf(a);
            for(int i=1;i<=s.length();i++){
                set.add(s.substring(0,i));
            }
        }
        int max=0;
        for(int a:arr2){
            String s=String.valueOf(a);
            for(int i=1;i<=s.length();i++){
                if(set.contains(s.substring(0,i))){
                    max=Math.max(max,i);
                }
            }
        }
        return max;
    }
}
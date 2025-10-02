class Solution {
    public int maxDepth(String s) {
        int i=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        while(i<s.length()){
            max=Math.max(max,count);
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')') count--;
            i++;
        }
        return max;
    }
}
class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            int a=Integer.parseInt(s.substring(11,13));
            if(a>60) count++;
        }
        return count;
    }
}
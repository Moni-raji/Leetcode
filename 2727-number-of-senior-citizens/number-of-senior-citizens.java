class Solution {
    public int countSeniors(String[] details) {
        //11 13
        int count=0;
        for(String s:details){
            int a=Integer.parseInt(s.substring(11,13));
            if(a>60) count++;
        }
        return count;
    }
}
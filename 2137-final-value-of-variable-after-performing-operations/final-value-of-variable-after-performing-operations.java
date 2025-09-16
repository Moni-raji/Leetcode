class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(String x:operations){
            if(x.equals("++X")) ++a;
            else if(x.equals("X++")) a++;
            else if(x.equals("--X")) --a;
            else a--;
        }
        return a;
    }
}
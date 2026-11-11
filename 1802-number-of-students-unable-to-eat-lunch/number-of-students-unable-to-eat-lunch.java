class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int countz=0;
        int counto=0;
        for(int a:students){
            if(a==0) countz++;
            else counto++;
        }
        for(int a:sandwiches){
            if(a==0 && countz>0) countz--;
            else if(a==1 && counto>0) counto--;
            else break;
        }
        return countz+counto;
    }
}
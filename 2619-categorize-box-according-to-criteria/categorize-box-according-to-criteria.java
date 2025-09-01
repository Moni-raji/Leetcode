class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        String result="";
        if(bulky(length,width,height) && heavy(mass)) result="Both";
        else if(!bulky(length,width,height) && !heavy(mass)) result="Neither";
        else if(bulky(length,width,height) && !heavy(mass)) result="Bulky";
        else result="Heavy";
        return result;
    }
    public boolean bulky(int l,int w,int h){
        if(l>=10000 || w>=10000 || h>=10000) return true;
        long v=1L*l*w*h;
        if(v>= 1000000000L) return true;
        return false;
    }
    public boolean heavy(int mass){
        if(mass >= 100) return true;
        return false;
    }
}
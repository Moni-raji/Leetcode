class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12) hour=0;
        double hrAngle=30*hour+0.5*minutes;
        double minAngle=minutes*6;
        double angleBtw=Math.abs(hrAngle-minAngle);
        return Math.min(angleBtw,360-angleBtw);
    }
}
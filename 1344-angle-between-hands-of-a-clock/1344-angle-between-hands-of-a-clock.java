class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12) hour=0;
        double angle=Math.abs(30*hour-(5.5*minutes));
        return angle>180?360-angle:angle;
    }
}
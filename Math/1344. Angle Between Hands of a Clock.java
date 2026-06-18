class Solution {
    public double angleClock(int hour, int minutes) {
        double ang1 = Math.abs(hour*30 - minutes*5.5);
        double ang2 = Math.abs(360 - ang1);
        return Math.min(ang1, ang2);
    }
}

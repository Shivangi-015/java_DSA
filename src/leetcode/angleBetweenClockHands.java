package leetcode;

public class angleBetweenClockHands {
    public static double angleClock(int hour, int minutes) {
        double hourhand_angle = (60*hour + minutes)*0.5;
        double minutehand_angle = 6*minutes;
        double angle = Math.abs(hourhand_angle - minutehand_angle);

        if(angle<=180.0){
            return angle;
        }
        else{
            return 360.0-angle;
        }
    }
    public static void main(String[] args){
        int hour = 3;
        int minutes = 15;
        System.out.println(angleClock(hour, minutes));
    }
}

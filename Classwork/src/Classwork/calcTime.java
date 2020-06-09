package Classwork;

public class calcTime {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static String getDurationString(double minutes, double seconds) {
        if (minutes >= 0) {
            if (seconds >= 0 && seconds <= 59) {
                double tseconds = (seconds + (minutes * 60));
                double hours = Math.floor((tseconds/60)/60);
                minutes = Math.floor((tseconds/60)-(hours*60));
                System.out.println(hours +"h "+ minutes +"m "+ seconds +"s ");
                return ((int) hours+"h " + (int) minutes+"m " + (int) seconds+"s ");
            }

        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(double seconds) {
            if (seconds >= 0) {
                double minutes = (Math.floor(seconds/60));
                seconds = ((seconds-(minutes*60)));
                return getDurationString(minutes,seconds);
            }
        return INVALID_VALUE_MESSAGE;
    }

}

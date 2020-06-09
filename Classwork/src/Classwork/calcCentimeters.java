package Classwork;

public class calcCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0) {
            if (inches >= 0 && inches <= 12) {
                inches = (inches + (feet * 12));
                return Math.round(inches * 2.54);
            }

        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
            if (inches >= 0) {
                double feet = Math.floor(inches/12);
                inches = (inches % 12);
                return calcFeetAndInchesToCentimeters(feet, inches);
        }
        return -1;
    }
}

package Classwork;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        int newscore = calculateScore("Tim", 500);
        System.out.println("New score is " + newscore);

        newscore = calculateScore(500);
        newscore = calculateScore();

       System.out.println(calcCentimeters.calcFeetAndInchesToCentimeters(5,6));
       System.out.println(calcCentimeters.calcFeetAndInchesToCentimeters(-5));
       System.out.println(calcTime.getDurationString(1000, 58));
       System.out.println(calcTime.getDurationString(100));
       System.out.println(areaCalc.area(5.0));
        System.out.println(areaCalc.area(50,50));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println(" Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println(" Unnamed player scored  0 points");
        return 0;
    }
}



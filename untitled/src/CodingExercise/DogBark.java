package CodingExercise;

public class DogBark {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeup = false;
        if (barking) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    wakeup = true;
                }
        }
        return wakeup;
    }

}

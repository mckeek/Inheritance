package CodingExercise;

public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(5000);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(5000);

        MegaBytesConverter.printMegabytesAndKiloBytes(-1025);

        boolean wakeup = DogBark.shouldWakeUp(false,6);
        System.out.println("wakeup = " + wakeup);
    }
}

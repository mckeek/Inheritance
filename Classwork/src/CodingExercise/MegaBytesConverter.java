package CodingExercise;

public class MegaBytesConverter {

    public static void printMegabytesAndKiloBytes(double kilobytes) {
        if(kilobytes > 0) {
            double megabytes =  Math.floor(kilobytes / 1024);
            double kilobyte =  (kilobytes % 1024);
            System.out.println(kilobytes + " kilobytes = " + megabytes + " mb and " + kilobyte + " kb");
        }
        else {
            System.out.println("Invalid Value");
        }
    }

}

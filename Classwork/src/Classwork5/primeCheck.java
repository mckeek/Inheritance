package Classwork5;

public class primeCheck {

    public static boolean PrimeCheck(int n) {
        if (n == 1) {
            return false;
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }

        }
        return true;
    }
}

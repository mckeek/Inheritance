package Classwork5;

public class Main {
    public int x = 0;
    int number = 4;
    public int finishNumber = 20;

    public static void main(String[] args) {
        int x = 0;
        for (int i = 2; i < 5000; i++) {
            boolean test = primeCheck.PrimeCheck(i);
            if (test) {
                x++;
                System.out.println("result for " + i + " = " + test);
                if (x == 10) {
                    System.out.println("break");
                    break;
                }

            }
        }
        int number = 4;

        System.out.println(sum3and5.sum3And5(1));
        System.out.println(isEvenNumber.IsEvenNumber(number));
    }


}








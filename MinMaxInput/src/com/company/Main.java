package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long avg = 0;
        int sum = 0;
        boolean first = true;
        int counter = 0;
        while(true) {

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                counter++;
                int number = scanner.nextInt();
                 sum = number + sum;
                 avg = Math.round(sum / counter);
            }
            else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }

            scanner.nextLine();
        }


        scanner.close();
    }
}

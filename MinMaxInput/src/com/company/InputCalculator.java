package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 1;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (true) {
                int number = scanner.nextInt();
                sum = number + sum;
                avg = sum / counter;
            }

            else{
                    System.out.println("SUM = " + sum + "AVG = " + avg);
                    break;
                }
                counter++;
                scanner.nextLine();
            }
        }
    }
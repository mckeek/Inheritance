package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while(true) {

            System.out.println("Enter " + counter + " of ten numbers :");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                System.out.println(sum + " is new sum");
            }
            else {
                System.out.println("Invalid input");
            }
            scanner.nextLine();
        }


        scanner.close();
    }
}


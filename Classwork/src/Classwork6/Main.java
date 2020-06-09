package Classwork6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter you name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // handles next line character (enter)

        System.out.println("Enter year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2018 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and your are " + age + " years old.");
            }
            else {
                System.out.println("Invalid Year of Birth");
            }
        }
        else {
                System.out.println("unable to parse yob");
            }

        scanner.close();



        Scanner scan2 = new Scanner(System.in);

        int counter = 1;
        int inSum = 0;
        while(counter < 5) {
            System.out.println("Enter " + counter + "of ten numbers :");
            boolean hasNextInt2 = scan2.hasNextInt();

            if(hasNextInt2) {
                int newNumber = scan2.nextInt();
                inSum = newNumber + inSum;
                counter++;
                System.out.println(inSum + "is new sum");
        }
            else {
                System.out.println("Invalid input");
            }
        }


        scan2.close();
    }
}

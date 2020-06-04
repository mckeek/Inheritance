package com.company;

public class Main {

    public static void main(String[] args) {
	// state and behavior
    // Object Oriented Programming
    //   Car porsche = new Car();
    // Car holden = new Car();
    // porsche.setModel("911");
    // System.out.println("Model is " + porsche.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        System.out.println( "");
        System.out.println( "Bank Account Experiment");
        System.out.println( "");

        BankAccount newAcount = new BankAccount();

        newAcount.deposit(500);
        newAcount.withdrawl(250);

        System.out.println( "");
        System.out.println( "VIP Experiment");
        System.out.println( "");

        VIPCustomer newVIP = new VIPCustomer("bob",100000, "bob@bob");
        System.out.println(newVIP.getcName() + " " + newVIP.getcEMail() + " " + newVIP.getcLimit() );



    }



}

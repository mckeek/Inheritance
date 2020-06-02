package com.company;

public class BankAccount {

    private String number;
    private double balance;
    private String name;
    private String eMail;
    private String phoneNumber;

    public BankAccount() {
        this("5678", 100, "default", "default", "default" );
        System.out.println("default set");

    }

    public BankAccount(String number, double balance, String name, String eMail, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String eMail, String phoneNumber) {
        this("9999",100.55, name, eMail, phoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("deposit of " + depositAmount + " made balance " + this.balance);
    }

    public void withdrawl(double withdrawl) {
        if(this.balance - withdrawl < 0) {
            System.out.println(this.balance + " insufficient funds");
        }
        else {    this.balance -= withdrawl;
            System.out.println("withdrawl of " + withdrawl + " made balance " + this.balance);
        }
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
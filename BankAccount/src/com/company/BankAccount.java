package com.company;

public class BankAccount {

    private String Number;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String Number, double accountBalance, String customerName, String customerEmailAddress, String customerPhoneNumber) {

        System.out.println("account constructor with parameters called.");

        this.Number = Number;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public void deposit(double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " was made. Your balance is " + this.accountBalance );
    }

    public void withdrawal(double withdrawalAmount){

        if(accountBalance - withdrawalAmount < 0){
            System.out.println("Only " + this.accountBalance + " is available. Withdrawal no processed");
        } else{
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount +  " Processed. Remaining balance is " + this.accountBalance);
        }

    }
    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

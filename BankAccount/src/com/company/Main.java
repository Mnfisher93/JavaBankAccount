package com.company;

public class Main {

    public static void main(String[] args) {


    BankAccount johnAccount = new BankAccount("12345", 0.00,
            "John Johnny", "myemail@john.com","1234567890");

    johnAccount.getCustomerEmailAddress();
    johnAccount.getCustomerPhoneNumber();

    johnAccount.deposit(50.0);
    johnAccount.withdrawal(100.0);

    johnAccount.deposit(51.0);
    johnAccount.withdrawal(100);



    }
}

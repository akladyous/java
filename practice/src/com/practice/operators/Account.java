package com.practice.operators;

public class Account {
    String name;
    int balance;
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        a1.name = "john";
        a1.balance = 10;

        a2 = a1;
        a2.name = "alex";
        System.out.println(a2.name);

    }
}

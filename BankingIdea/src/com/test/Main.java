package com.test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Debit Account:");
        DebitAccount da = new DebitAccount();
        try {
            da.setBalance(3);
            da.checkBalance();
        } catch (IllegalArgumentException eb) {
            System.out.println(eb.getMessage());
        }
        try {
            da.setWithdraw(8);
            da.checkWithdraw();
            da.paymentFee();
            da.withdrawLimit();
            da.withdraw();
            da.restBalance();
            da.printResult();
        } catch (IllegalArgumentException ew) {
            System.out.println(ew.getMessage());
        }
        System.out.println();

        System.out.println("Credit Account:");
        CreditAccount ca = new CreditAccount();
        ca.setBalance(0);
        try {
            ca.setCredLimit(80);
            ca.checkCreLimit();
        } catch (IllegalArgumentException el) {
            System.out.println(el.getMessage());
        }
        try {
            ca.setWithdraw(8);
            ca.checkWithdraw();

            ca.paymentFee();
            ca.withdrawLimit();
            ca.withdraw();
            ca.restBalance();
            ca.printResult();

        } catch (IllegalArgumentException ew) {
            System.out.println(ew.getMessage());
        }
    }

}


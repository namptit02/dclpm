package org.example;

import java.util.Scanner;

public class InterestCalculator {
//    private static int balance;
//    private static int tienLai;
//    private static int days;
//    private static boolean isQuarterly;

//    public InterestCalculator(int balance, int tienLai, int days, boolean isQuarterly) {
//        this.balance = balance;
//        this.tienLai = tienLai;
//        this.days = days;
//        this.isQuarterly = isQuarterly;
//    }

//    public InterestCalculator(){
//
//    }


    public double calculateInterest(double balance, int days, boolean isQuarterly) {
        double rate;
        double interest = 0.0;

        if (days < 30) {
            rate = 0.1 / 100; // 0.1% per month
            interest = balance * days * rate / 365;
        } else if (days >= 30 && days < 60) {
            rate = 0.3 / 100; // 0.3% for the first 30 days
            interest = balance * (30 * rate + (days - 30) * 0.1 / 100) / 365;
        } else if (days >= 60 && days < 90) {
            rate = 0.31 / 100; // 0.31% for the first 60 days
            interest = balance * (60 * 0.3 / 100 + (days - 60) * rate) / 365;
        } else if (days >= 90 && days < 120) {
            rate = isQuarterly ? 0.33 / 100 : 0.32 / 100; // 0.33% if quarterly, otherwise 0.32%
            interest = balance * (90 * 0.31 / 100 + (days - 90) * rate) / 365;
        } else if (days >= 120 && days < 150) {
            rate = 3.2 / 100; // 3.2% for the first 120 days
            interest = balance * (120 * 0.32 / 100 + (days - 120) * 0.1 / 100) / 365;
        } else if (days >= 150 && days < 180) {
            rate = 3.2 / 100; // 3.2% for the first 150 days
            interest = balance * (150 * 0.32 / 100 + (days - 150) * 0.1 / 100) / 365;
        } else if (days >= 180) {
            rate = isQuarterly ? 0.49 / 100 : 0.32 / 100; // 0.49% if quarterly, otherwise 0.32%
            interest = balance * (180 * 0.32 / 100 + (days - 180) * rate) / 365;
        }

        return interest;
    }


}

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterestCalculator i = new InterestCalculator();

        System.out.print("Nhập số dư thực tế (VNĐ): ");
        double balance = scanner.nextDouble();

        System.out.print("Nhập số ngày duy trì số dư thực tế: ");
        int days = scanner.nextInt();

        System.out.print("Lai theo thang: ");
        int term = days/30;

        System.out.print("Lãi hàng quý? (true/false): ");
        boolean isQuarterly = scanner.nextBoolean();

        double interest = i.calculateInterest(balance, days, isQuarterly);
        System.out.printf("Số tiền lãi: %.2f VNĐ\n", interest);

        scanner.close();
    }
}

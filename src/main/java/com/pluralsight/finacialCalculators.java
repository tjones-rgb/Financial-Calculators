package com.pluralsight;

import java.util.Scanner;

public class finacialCalculators {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Choose a calculator \n 1. Mortage Calculator \n 2. Future Value \n 3.Present value");
    System.out.print("Option: ");
    int option = scan.nextInt();

    if (option == 1) {
        mortageCalculator();
    } else if (option == 2) {
        //futureeValue();
    } else{
        System.out.println("Option not available: Restart");

    }

    }


      public static void mortageCalculator() {

        System.out.print("Enter Loan Amount: ");
        double loanAmount = scan.nextDouble();


        System.out.print("Enter Interest Rate: ");
        double interestRate = scan.nextDouble() /100;


        System.out.print("Enter Loan Length(in years): ");
        int loanLengthInYears = scan.nextInt();

        System.out.printf("%.2f - %.2f - %d", loanAmount, interestRate, loanLengthInYears);
        /** M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)
 * //
 */

        int numberOfMonthlyPayments = loanLengthInYears * 12;

        double monthlyI = interestRate /12;

        double monthlyPayments = loanAmount * (monthlyI * Math.pow (1 + monthlyI, numberOfMonthlyPayments) / (Math.pow(1 +monthlyI, numberOfMonthlyPayments) - 1));

        double totalInterest = (monthlyPayments * numberOfMonthlyPayments)-loanAmount;

        System.out.printf("Monthly Payment: %.2f, Total Interest: %.2f", monthlyPayments,totalInterest);




    }
}

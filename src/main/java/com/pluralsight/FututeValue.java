package com.pluralsight;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class FututeValue {
    public static void main(String[] args) {
//If you deposit $1,000 in a CD that earns 1.75%
//interest and matures in 5 years, your CD's ending balance will
//be $ 1,091.44 and you would have earned $91.44 in interest
//Future Value (FV) =
//o Principal (P):
//- This is the initial deposit amount.
//o Annual Interest Rate (r):
//- The nominal annual interest rate in decimal form.
//(e.g., 1.75% = 0.0175).
//o Number of Years (t):
//- The total number of years the deposit will earn interest.
//o Days Per Year:
//- Daily compounding assumes 365 days per year.
//o Total Number of Days:
//- This is 365 × t (because there are 365 days per year).
//• Total Interest Earned = FV - P
        Scanner scan = new Scanner(System.in);

        System.out.print("Principal"); //intialDepositAmount
       double Principal = scan.nextDouble();

       System.out.print("Rate"); //Annual Interest Rate
       double interestRate = scan.nextDouble();

       System.out.print("Numbers Of Years"); //he total number of years the deposit will earn interest
       int Years = scan.nextInt();

       System.out.print("Days Per Year"); //Daily compounding assumes 365 days per year.
       int Days = scan.nextInt();







    }
}

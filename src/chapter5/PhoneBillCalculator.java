package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    private double planFee;
    private double overageMins;
    private double overageFee;
    private double total;

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Plan fee: ");
        double planFee = scanner.nextDouble();
        System.out.println("Enter overage mins:");
        double overageMins = scanner.nextDouble();
        scanner.close();
        double overageFee = calculateOverageFee(overageMins);
        double tax = calculateTax(planFee, overageFee);
        double total = calculateTotal(planFee, overageFee, tax);
        printFinalBill(planFee, overageFee, tax, total);


    }

    public static double calculateOverageFee(double overageMins){
        return overageMins * 0.25;
    }

    public static double calculateTax(double planFee, double overageFee){
        return (planFee + overageFee) * 0.15;
    }

    public static double calculateTotal(double planFee, double overageFee, double tax ){
        double total =  planFee + overageFee + tax;
        return total;
    }

    public static void printFinalBill(double planFee, double overageFee, double tax, double total){
        System.out.println("Your total bill is:");
        System.out.println("Plan Fee: $" + planFee);
        System.out.println("Overage Fee: $" + overageFee);
        System.out.println("Tax: $" + tax);
        System.out.println("Total payable: $" + total);
    }

}

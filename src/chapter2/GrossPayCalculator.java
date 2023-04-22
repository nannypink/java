package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

        // Get hours worked
        System.out.println("Enter number of hours worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get hourly rate
        System.out.println("Enter employee pay rate per hour");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply hours by pay rate
        double grossPay = hours * rate;

        // Display result
        System.out.println("The employee's gross pay is £" + grossPay);
    }
}

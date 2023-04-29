package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static Scanner scanner = new Scanner(System.in);
    static int reqSalary = 25000;
    static int reqCreditScore = 700;

    public static void main(String args[]) {
        
        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified););
        scanner.close();
    }

    public static double getSalary() {
        System.out.println("Please enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Please enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= reqCreditScore && salary >= reqSalary)
            return true;
    }

    public static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Congrats, you are qualified");
        } else {
            System.out.println("Sorry, you are not qualified");
        }

    }

}

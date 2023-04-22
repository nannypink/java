package chapter2;

import java.util.Scanner;

public class MadLib {
    public static void main(String arg[]){
        // Ask for a season
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a season of the year");
        String season = scanner.next();

        //Ask for a whole number
        System.out.println("Please enter a whole number");
        int number = scanner.nextInt();

        //Ask for an adjective
        System.out.println("Please enter an adjective");
        String adj = scanner.next();
        scanner.close();

        String result = "On a " + adj + " " + season + " day, I drink a minimum of " + number + " cups of coffee";

        System.out.println(result);
    }
}

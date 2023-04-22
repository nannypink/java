package chapter3;
/*
IF statement.
All sales people get £1000pw
Over 10 sales get bonus of £250
 */
import java.util.Scanner;
public class SalaryCalculator {

    public static void  main(String args[]) {

        // Initialise known values
        int salary = 1000;
        int bonus = 250;
        int target = 10;

        // Get values for the unknowns
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonuses
        if(sales > target){
            salary = salary + bonus;
        }

        //Output result
        System.out.println("The employee's salary is £" + salary);
    }
}

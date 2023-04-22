package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){
        //initialise what we know
        int reqSalary = 30000;
        int reqYearsEmp = 2;

        // get what we don't know
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        String x = "Enter number of years with your current employer";
        System.out.println(x);
        double years = scanner.nextDouble();
        scanner.close();


        //make decision and output
        if(salary >= reqSalary){
            if(years >= reqYearsEmp){
                String x2 = "Congratulations, you qualify for the loan";
                System.out.println(x2);
            }
            else{
                System.out.println("Sorry, you have to have worked at your current job for a minimum of " + reqYearsEmp + " years");
            }
        } 
        else{
            System.out.println("Sorry, you must earn at least £" + reqSalary + " to qualify for the loan");
        }
   }
}

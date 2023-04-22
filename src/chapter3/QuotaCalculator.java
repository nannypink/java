package chapter3;

import java.util.Scanner;

/*
IF ELSE
All salespeople are expected to make 10 sales pw
Those that hit target get a congratulations message
Those that miss target are informed how many sales they were short
 */
public class QuotaCalculator {
    public static void main(String args[]){
        // Initialise values we know
        int target = 10;

        // Get unknown values
        System.out.println("Enter the number of sales made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Make decision on which path to take and output result
        if(sales >= target) {
            System.out.println("Congratulations, you met your target!");
        }
        else{
                int salesShort = target - sales;
                System.out.println("You did not meet your target. You were " + salesShort + " sales short" );
            }
        }
    }


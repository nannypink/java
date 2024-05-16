package chapter7;

import java.util.Scanner;

public class DaysOfWeek {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            System.out.println("Enter a number: ");
            int input = scanner.nextInt();
            System.out.println(days[input - 1]);

    }
}

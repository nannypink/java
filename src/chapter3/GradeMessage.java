package chapter3;

import java.util.Scanner;

public class GradeMessage{
    public static void main(String args[]) {

        System.out.println("Please enter your letter grade as a capital letter");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        
        switch(grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh, try again!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
        System.out.println(message);
    }
}
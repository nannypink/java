package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 7;
    private static final int MAX_TICKET_NUMBER = 69;
    
    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    // Includes search for duplicates, adds only unique random numbers
    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i=0; i<LENGTH; i++) {
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while(search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    // Example of sequential search
    public static boolean search(int[] array, int numberToSearch){
        for(int value: array){
            if(value == numberToSearch){
                return true;
            }
        }
        return false;
    }
    // Example of binary search
    public static boolean binarySearch(int[] array, int numberToSearch){
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearch);
        if(index >= 0){
            return true;
        }
        else return false;
    }
   
    public static void printTicket(int ticket[]){
        for (int i=1; i<LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}

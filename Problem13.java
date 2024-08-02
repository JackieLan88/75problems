/*Write a program that has the user enter integers between 0 and 9999 until the user enters some 
integer twice.  Your program then prints to the console window how many distinct integers were entered.  
You may assume all integers entered by the user are between 0 and 9999.  */
import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[9999];
        boolean exiting = true;
        int count = 0;
        int userInput = -1;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = -1;
        }

        do {
            myArray[count] = userInput;
            System.out.print("Enter an int between (0-9999): ");
            userInput = input.nextInt();
            count++;

            for (int i = 0; i < myArray.length; i++) {
                if (userInput == myArray[i]) {
                    exiting = false;
                }
            }

        } while (exiting);

        System.out.println("You entered " + (count - 1) + " value(s)");
    }
}

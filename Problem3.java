/* Write a Java program that prompts the user to enter integers from the keyboard one at a time. The 
program stops reading integers once the user enters the same value three times consecutively (meaning three 
times, one after the other). Once input is completed the program is to display the message "Same entered 3 
in a row".  */
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int temp2 = -1;
        boolean repeat = true;
        int temp = -1;
        while (repeat) {
            System.out.println("Enter an integer: ");
            int number = input.nextInt();
            if (number == temp) {
                if (number == temp2) {
                    repeat = false;
                    System.out.println("This integer has been entered 3 times in a row");

                }
                temp2 = number;

            }
            temp = number;

        }

    }
}

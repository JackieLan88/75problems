/*In US currency, a quarter is worth 25 cents, a nickel is worth 5 cents, and a penny is worth 1 cent.  
Write a Java program that prompts the user to enter a number representing a dollar amount that consists of all 
pennies. You may assume the user input value is greater than zero. The program is to distribute that amount into 
quarters, nickels and pennies, using as few coins as possible. Note: you may not use any currency values other 
than quarters, nickels, and pennies.  */
import java.util.Scanner;

public class Problem15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float dollars = 1.0f;
        int quarter, nickles, pennies;
        System.out.print("\t\t\t\t\tCurrecy Converter\n\n");

        while (dollars <= 1) {
            System.out.print("\nEnter an amount of dollar you would like to receive back in change: $");
            dollars = input.nextFloat();

            if (dollars > 0) {
                dollars = dollars * 100;

                quarter = (int) dollars / 25;
                nickles = (int) (dollars % 25) / 5;
                pennies = (int) (dollars % 25) % 5;

                System.out.println("Your change in quarters: " + quarter + ", nickles: " + nickles + " and pennies: " + pennies);
                System.out.println("Would you to enter any more bills? yes(1) no(2) ");
                dollars = input.nextFloat();
            } else {
                System.out.print("Not valid...Enter another integer...");
            }

        }//end of loop

        System.out.println("Thanks for exchanging!");
    }

}

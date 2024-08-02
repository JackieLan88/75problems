/*Write a Java program that prompts the user to enter three integers a, b, and c.  As output the 
program is to display the number of integers entered by the user that are odd.  The output statement must 
exactly match the sample output statements provided below. */
import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] letters = new int[3];
        char[] letter = {'a', 'b', 'c'};
        int count = 0;
        //prompt user 
        //System.out.println("Enter a: ");
        //letters[0] = input.nextInt();
        //System.out.println("Enter b: ");
        //letters[1] = input.nextInt();
        //System.out.println("Enter c: ");
        //letters[2] = input.nextInt();

        for (int i = 0; i < letters.length; i++) {
            System.out.println("Enter " + letter[i] + ": ");
            letters[i] = input.nextInt();
            if (letters[i] % 2 == 1) {
                count++;
            }
        }

        switch (count) {
            case 0:
                System.out.println("No integers were odd");
                break;
            case 1:
                System.out.println("One integer was odd.");
                break;
            case 2:
                System.out.println("Two integers were odd.");
                break;
            case 3:
                System.out.println("Three integers were odd.");
                break;
        }
    }
}

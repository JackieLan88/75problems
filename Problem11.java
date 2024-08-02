/*Write the method  public static int rangeProduct(int a, int b).  Assume 
that 𝑎 < 𝑏.  Your method must compute and return the product of the integers in the range from 𝑎 to 𝑏.  For 
example, if 𝑎 = 3 and 𝑏 = 6, your method would compute and return the product 3 × 4 × 5 × 6 = 360. */
import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for a: ");
        int a = input.nextInt();
        System.out.println("Enter a number (greater than a) for b: ");
        int b = input.nextInt();

        System.out.println("The total product between " + a + " and " + b + " = " + rangeProduct(a, b));
    }// end of main method

    public static int rangeProduct(int a, int b) {
        int total = a;
        while (a < b) {
            total *= ++a;
        }
        return total;
    }

}

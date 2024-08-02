/*Write a Java program that has the user enter three decimal numbers. The program then outputs 
whether they are entered in strictly increasing order, strictly decreasing order, or neither.  */
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = 0.0f, num2 = 0.0f, num3 = 0.0f;

        System.out.println("Enter your first decimal number: ");
        num1 = input.nextFloat();
        System.out.println("Enter your second decimal number: ");
        num2 = input.nextFloat();
        System.out.println("Enter your third decimal number: ");
        num3 = input.nextFloat();

        if (num1 >= num2) {
            if (num2 > num3) {
                System.out.println("DECREASING!!");
            } else {
                System.out.println("NEITHER!!");
            }

        } else if (num1 <= num2) {
            if (num2 < num3) {
                System.out.println("INCREASING!!");
            } else {
                System.out.println("NEITHER!!");
            }

        }
    }
}

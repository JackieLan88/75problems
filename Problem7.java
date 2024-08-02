/*Write a Java program that prompts the user to enter two integers a and b.  You may assume 
without checking that 𝑏>0.  Without using Math.pow or any other library methods, compute and output the 
value  𝑎𝑏.  For example, if the user enters 𝑎=2 and 𝑏=5, the program would output the value 32 since 
25=2×2×2×2×2=32.   */
import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.println("Enter a number for a: ");
        a = input.nextInt();
        System.out.println("Enter a number for b: ");
        b = input.nextInt();

        int total = a;

        for (int i = 1; i < b; i++) {
            total = total * a;
        }
        System.out.println(a + " to the power of " + b + " is " + total);
    }
}

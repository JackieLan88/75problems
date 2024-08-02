
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


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

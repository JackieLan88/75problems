/*Write the method below that takes two integer arguments a and b.  The method prompts the 
user to enter integers on the keyboard one at a time, until a and b have both been entered.  Date entry 
terminates once both values have been entered. The method then prints to the console window the number 
of integers entered. */
import java.util.Scanner;

public class Problem17{
    public static void main(String[] args){
        howManyEnteredBeforeSeenBoth(54,5);
    }

    public static void howManyEnteredBeforeSeenBoth(int a, int b)  {
        Scanner input = new Scanner(System.in);
        int userInput = -1;
        boolean foundA = false;
        boolean foundB = false;
        int count = 0;

        while(!foundA || !foundB){ // !aEntered is true (because aEntered is false), !bEntered is true (because bEntered is false),condition is true
            System.out.print("Enter a number: ");
            userInput = input.nextInt();

            if(userInput == a){     // a = 54
                foundA = true;
                                            //eventhough one of these ifs could be satisfied, the loop will still run until both are satisfied
            }else if(userInput == b){                                   // loop will run if one of them is still true = OR

                foundB = true;
            }else
                count++;

        }//end of loop
        System.out.println("You entered " + count + " numbers before typing " + a + " and "+ b);

    } 

}
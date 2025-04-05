/*Write the method below that takes four integer arguments and returns true if and only if at 
least three of the four values are the same.  For example, if the values passed in are 5, 3, 5, 5, it would 
return true.  If the values passed in are 7, 3, 7, 9, it would return false.  */
public class Problem16 {

    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c =  (int) (Math.random() * 10);
        int d = (int) (Math.random()  * 10);
        System.out.println("It is " + atLeastThreeMatch(a, b, c, d) + " that at least three are the same. " + a + " " + b + " " + c + " " + d);
    }

    public static boolean atLeastThreeMatch(int a, int b, int c, int d) {
        return (a == b && a == c) || (a == b && a == d) || (a == c && a == d) || (b == c && b == d);
    }
}

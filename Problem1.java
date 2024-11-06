/* Write the Java method below, which takes a two-dimensional array A of positive integers.  The 
method returns the index of the row that has the largest sum.  Assume no two rows have the same sum.  For 
example, if A is the array below, then row 0’s values sum to 21, row 1’s values sum to 19, row 2’s values sum 
to 23, and row 3’s values sum to 20.  Since row 2 has the highest sum, the method would return the value 2 */
public class Problem1 {

    public static void main(String[] args) {
        int[][] myArray = {{5, 10, 1, 5}, {1, 2, 1, 15}, {8, 7, 5, 3}, {6, 1, 12, 1}};
        System.out.println("Row " + indexOfHighestRowSum(myArray) + " has the largest sum overall.");

    }//end of main method

    public static int indexOfHighestRowSum(int[][] A) {
        int total = 0;
        int total2 = 0, rowNum = 0;

        for (int j = 0; j < A[0].length; j++) {
            total += A[0][j];   //initialize total with the sum of the first row
        }
        for (int row = 1; row < A.length; row++) { //iterate through all rows, and remember we need to start at row 1 
            for (int col = 0; col < A[row].length; col++) {   //each element of row
                total2 += A[row][col];

            }
            if (total2 > total) {
                rowNum = row;

            }
            total2 = 0;
        }

        return rowNum;
    }//end of method index
} // end of class

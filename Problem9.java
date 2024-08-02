/*The method receives two parameters, an integer array A and an integer variable b. The method returns a new 
array (do not change A) that is identical to A except that all cells that contain the value stored in the variable b  
are no longer present.  */
public class Problem9 {

    public static void main(String[] args) {

        int[] A = {6, 103, 77, 49, 0, 83, 77, 77, 444, 444};
        int b = 77;
        int[] result = newSmallerArray(A, b);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }   // end of main method

    public static int[] newSmallerArray(int[] A, int b) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != b) {
                count++;
            }
        }
        int[] copy = new int[count];
        count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != b) {
                copy[count++] = A[i];
            }
        }
        return copy;
    }   //  end of method new smaller array

}

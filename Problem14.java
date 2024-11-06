/*Write the method:  public static int largestInCommon(int [] A, int [] B). 
This method takes two arrays A and B, each containing positive integers only (no error checking necessary) 
and returns the largest value that is common to both A and B.  If there is no value that is contained in both A 
and B, return the value –1. */
public class Problem14 {

    public static void main(String[] args) {
        int[] A = {3, 8, 5, 2, 7, 9};
        int[] B = {5, 1, 22, 7, 2, 15, 3};
        int result = largestInCommon(A, B);
        System.out.println("The largest common integer in both arrays is: " + (result != -1 ? result : "non-existent"));

        int[] C = {35, 12, 19, 35, 45};
        int[] D = {55, 99, 12};
        result = largestInCommon(C, D);
        System.out.println("The largest common integer in both arrays is: " + (result != -1 ? result : "non-existent"));

        int[] E = {33, 11, 77, 44, 55};
        int[] F = {99, 88, 222, 66, 1000};
        result = largestInCommon(E, F);
        System.out.println("The largest common integer in both arrays is: " + (result != -1 ? result : "non-existent"));
    }

    public static int largestInCommon(int[] A, int[] B) {
        int maxNum = -1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (B[j] == A[i]) {
                    maxNum = B[j];
                }
            }
        }

        return maxNum;
    }//end of largestInCommon
}

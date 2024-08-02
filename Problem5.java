/*Write the Java method below that takes two integer arrays A and B and returns true only if the 
values in A appear consecutively in B. You may assume all values in A are distinct. However, the values in B 
may or may not include duplicates. */
public class Problem5 {

    public static void main(String[] args) {
        int[] A = {55, 33, 22};
        int[] B = {7, 6, 55, 33, 5, 22, 1};
        System.out.println(appearsConsecutively(A, B));
    }   //end of main method

    public static boolean appearsConsecutively(int[] A, int[] B) {
        String arrayA = "";
        String arrayB = "";

        for (int i = 0; i < A.length; i++) {
            arrayA += A[i];
        }
        for (int i = 0; i < B.length; i++) {
            arrayB += B[i];
        }

        if (arrayB.contains(arrayA)) {
            return true;
        } else {
            return false;
        }

    } // end of appearsConsecutively
}//end of class

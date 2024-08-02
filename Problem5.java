
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

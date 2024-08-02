/*The method receives two integer arrays A and B as parameters. Both A  and  B are already in sorted order from 
lowest to highest.  Array A has no repeated integers, and array B has no repeated integers, but there may be 
integers that appear in both array A and array B.  Arrays A and B do not necessarily have the same length. 
 
The method is to return the number of values that appear in both array A and array B.  For example, if A and B 
were the arrays below, the return value would be 3, since the arrays have 3 values in common: 15, 22, and 93.  */
public class Problem8 {

    public static void main(String[] args) {
        int[] A = {6, 8, 15, 22, 77, 93, 98};
        int[] B = {5, 15, 22, 44, 93};

        int common = howManyInCommon(A, B);
        System.out.println("Number of repeated integers in both arrays: " + common);

    }

    public static int howManyInCommon(int[] A, int[] B) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    count++;
                }
            }
        }
        return count;

    }
}

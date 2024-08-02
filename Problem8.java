
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

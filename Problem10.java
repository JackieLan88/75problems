
public class Problem10 {

    public static void main(String[] args) {
        int[] myArray = {88, 88, 88, 63, 29, 77, 77, 50, 44, 45, 8, 0, 99, 99};
        System.out.println("The index where the first two values repeat, is on index: " + indexOfFirstPair(myArray));

    }//end of main

    public static int indexOfFirstPair(int[] myArray) {
        int index = -1;
        boolean found = true;

        while (found) {
            for (int i = 0; i < myArray.length - 2; i++) {
                if (myArray[i] == myArray[i + 1] && myArray[i] != myArray[i + 2]) {
                    index = i;
                    found = false;
                }
            }
        }

        return index;
    } //end of indexOfFirstPair

}

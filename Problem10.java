/*The method receives a single parameter, an integer array myArray. The method is to find the location of 
the first pair of adjacent matching values in the array. Once found, the method is to return the index of the 
first value of this pair. Note: this must be exactly a pair – it cannot be part of three or more values in a 
row.  If there is no such index, the method is to return the value  –1 (negative 1).  */
public class Problem10 {

    public static void main(String[] args) {
        int[] myArray = {88, 88, 88, 63, 29, 77, 77, 77, 77, 50, 44, 44, 8, 0, 99, 99};
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

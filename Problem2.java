/* Write the Java method below that takes an integer array freq and a character array text.  
These two arrays have the same length.  The method returns a character array that has freq[0] repetitions 
of the first character in the text array, then freq[1] repetitions of the next character in the text array, 
and so on. */
public class Problem2 {

    public static void main(String[] args) {
        int[] fre = {3, 6, 2, 5, 2, 1};
        char[] letters = {'m', 's', 'k', 'p', 'y', 'q'};

        char[] array = repeatChars(fre, letters);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static char[] repeatChars(int[] freq, char[] text) {
        int j = 0;
        for (int i = 0; i < freq.length; i++) { //counting the length of our new array
            j += freq[i];
        }
        System.out.println(j);      // length
        int index = 0;
        char[] repeat = new char[j];
        for (int i = 0; i < freq.length; i++) {       //move around freq array
            for (int r = 0; r < freq[i]; r++) {
                repeat[index++] = text[i];

            }

        }

        return repeat;
    }
}

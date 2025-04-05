/*Write the method below that takes an integer array myArray. The method returns the value in 
array myArray that appears the most.  For example, if myArray were the array below, the method would 
return the value 39, because 39 appears five times in myArray and no other integer appears that many times. 
You may assume that some value in myArray does appear more frequently than all others*/

public class Problem18{

    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5,6,7,8,9,9,0,43};
        for(int i = 0; i < myArray.length; i++){
            if(i == 0){
                System.out.print("[" + myArray[i] );
            }else
                System.out.print(", "+myArray[i]);
        }

        System.out.print("].\nThe digit that has repeated frequently is: " + mostFrequentValue(myArray));
    }//end of main method

    public static int mostFrequentValue(int [] myArray){
        int mostRepeat = 0; //store value
        int mostCount = 0; //counting max repetitions of a number in array
        for(int i = 0 ; i < myArray.length; i++){
            int count = 0;
            for (int j = i + 1; j < myArray.length; j++){
                if(myArray[i] == myArray[j]){
                    count++;
                }
            }//inner loop

            if(count > mostCount){
                mostCount = count;
                mostRepeat = myArray[i];
            }
        }//outer loop
        return mostRepeat;

    }
}
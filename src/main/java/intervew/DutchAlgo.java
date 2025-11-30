package intervew;

import java.util.Arrays;

public class DutchAlgo {

    public static void main(String[] args) {

        int[] inputArray = {2,0,2, 1, 1, 0};
        int start = 0;
        int middle = 0;
        int end = inputArray.length - 1;

        while (middle <= end) {

            switch (inputArray[middle]) {


                case 0:
                    swapNumbers(inputArray, start, middle);
                    start++;
                        middle++;
                        break;

                case 1:
                    swapNumbers(inputArray, start, middle);
                    middle++;

                case 2:
                    swapNumbers(inputArray, start, end);
                    end--;
                    break;

            }


        }
        System.out.println(Arrays.toString(inputArray));

    }
    private static void swapNumbers( int[] numArray, int i, int j)
    {
        int temp=0;
        temp=numArray[i];
        numArray[i]=numArray[j];
        numArray[j]=temp;


    }
}

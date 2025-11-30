package Array;

public class SmallestNumberArray {
    public static void main(String[] args) {

        int[] numArray={5,2,9,1,7};
        int smallest=numArray[0];

        for( int i=0;i<numArray.length;i++)
        {
            if (numArray[i]< smallest)
            {
                smallest=numArray[i];

            }
        }
        System.out.println(smallest);

        }

    }


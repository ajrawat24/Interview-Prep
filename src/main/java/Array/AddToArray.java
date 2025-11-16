package Array;

import java.util.Arrays;

public class AddToArray {

    public static void main(String[] args) {

        int[] a={1,2,3};
        int num=4;
        int length= a.length;
        int[] b= new int[length+1];
        b[a.length]=num;
        System.out.println("Adding elements to the array"+ b[a.length]);
        for(int j=0;j<a.length;j++){

            b[j]=a[j];
        }

        for(int j=0;j<b.length;j++)
        {
            System.out.println(b[j]);
        }



    }
}

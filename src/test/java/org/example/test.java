package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {

    public static void main(String[] args) {

        int[] arr = {3,4,7,8,9};
        //System.out.println(arr.length);
        boolean isPrime = true;

        for (int i = 0; i <= arr.length - 1; i++) {
            int num = arr[i];

            for (int j = 2; j < num / 2; j++) {
                if (num % j == 0) {
                    System.out.println(num+ "Number is not prime");
                    isPrime = false;
                }

                else {
                    System.out.println(num + "Number is prime");
                    break;
                }

            }

       /* Write code to check if numbers in an array are prime.
        Create an interface with a method to validate prime numbers,
                implement the interface in a separate class,
        and use that class in main method to check all array elements. */

        }
    }
}

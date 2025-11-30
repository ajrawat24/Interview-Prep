package org.example;

public class CountNumber {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code onli
        public static void main(String[] args) {
            int num=534207;
            int count=0;
            while (num!=0)
            {
                count=count+1;
                num= num/10;

            }
            System.out.println(count);

        }

    }


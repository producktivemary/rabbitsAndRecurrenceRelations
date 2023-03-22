package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateNumberofRabbits(35 , 5) );
        // write your code here
    }

    public static long calculateNumberofRabbits(long n, long k) {

        long fn;
        if (n == 1 ) {
            return fn = 1;
        } else if (n == 2) {
            return fn = k;
        }

        long one = calculateNumberofRabbits( n-1, k);
        long two = calculateNumberofRabbits(n -2, k);
        fn =  one + two * k;

        if (n <= 4) {
            return (one + two);
        }

        return fn;
    }
}

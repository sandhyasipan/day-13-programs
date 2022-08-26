package com.bridgelab;

public class Maxnumber {
    public static <X extends Comparable<X>> X maximum(X a, X b, X c) {

        X max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 10, 20, 30, maximum(10, 20, 30));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 11.11, 21.21, 31.31, maximum(11.11, 12.12, 13.13));
        System.out.printf("Maximum of %s, %s and %s is %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
    }
}

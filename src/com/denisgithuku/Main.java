package com.denisgithuku;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter n: ");
        var input = new Scanner(System.in);
        Integer n = input.nextInt();
        recursiveMethod(n);
    }

    static void recursiveMethod(Integer n) {
        if (n < 1){
            System.out.println("n is less than 1");
        } else {
            recursiveMethod(n - 1);
            System.out.println(n);
        }
    }
}

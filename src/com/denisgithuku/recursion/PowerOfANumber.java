package com.denisgithuku.recursion;

public class PowerOfANumber {
    public static void main(String[] args){
        System.out.println(power(4, 3));
    }
    public static int power(int base, int exp){
        if(exp < 0) {
            return 0;
        }
        if (exp == 0){
            return 1;
        }
        return base * power(base, exp- 1);
    }
}

package com.denisgithuku.adts.arrays.project;

import java.util.Arrays;
import java.util.Scanner;

public class AverageTemperature {
    static int[] temperatureArray = null;
    static Scanner scanner = new Scanner(System.in);

    public AverageTemperature(int arrSize) {
        temperatureArray = new int[arrSize];
    }

    public static void main(String[] args) {
        System.out.print("Enter the no of days: ");
        var arrSize = scanner.nextInt();
        new AverageTemperature(arrSize);
        inputTemperature(arrSize);
        System.out.println("The temperature for the " + arrSize + " day(s) is " + Arrays.toString(temperatureArray));
        calculateAndCheckAverage(temperatureArray, arrSize);
    }

    public static void inputTemperature(int days) {
        for (int i = 0; i < days; i++) {
            System.out.print("Enter day " + (i+1) + "'s temperature: ");
            var temperature = scanner.nextInt();
            temperatureArray[i] = temperature;
        }
    }

    public static void calculateAndCheckAverage(int[] temperatureArray, int numOfDays) {
        double sum = 0;
        int above = 0;

        for (int j = 0; j < temperatureArray.length; j++) {
            sum += temperatureArray[j];
        }
        double average = sum / numOfDays;
        System.out.println("The average is: " + average);

        for (int j = 0; j < temperatureArray.length; j++) {
            if (temperatureArray[j] > average) {
                above++;
            }
        }
        System.out.println("Days with temperature above average: " + above);
    }
}

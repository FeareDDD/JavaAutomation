package com.example.edu.demo;

import java.util.Scanner;
import java.lang.Math;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the numeric series length:");
        int numericSeriesLength = scanner.nextInt();

        System.out.println("Set minimal square number:");
        int minSquareNumber = scanner.nextInt();

        System.out.println(getNumberSeries(numericSeriesLength, minSquareNumber));
    }

    public static String getNumberSeries(int numericSeriesLength, int minSquareNumber){
        int squareRoot = (int)Math.sqrt(minSquareNumber);
        String naturalNumbers = new String();

        for (int i = 0; i <= numericSeriesLength; i++){
            naturalNumbers += String.format("%s, ", squareRoot);
            squareRoot += 1;
        }

        if(naturalNumbers.endsWith(", ")) {
            naturalNumbers = naturalNumbers.substring(0, naturalNumbers.length() - 2);
        }

        return naturalNumbers;
    }
}

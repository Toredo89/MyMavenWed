package org.example.Lesson_4;

import java.util.Scanner;

public class Triangle {

    public double geroneSquare;

    public static void main(String[] args) throws MyException {

        System.out.printf("Площадь %.2f",geroneSquare(5, 5, 5));

    }

    public static double geroneSquare (double a, double b, double c) throws MyException {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}

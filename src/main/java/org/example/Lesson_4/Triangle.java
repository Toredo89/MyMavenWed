package org.example.Lesson_4;

import static java.lang.Math.sqrt;

public class Triangle {
    public static int Square(int a, int b, int c) throws MyException {
        int p = (a + b + c) / 2;
        int result = (int) sqrt(p*(p - a)*(p - b)*(p - c));

        return result;
    }
}

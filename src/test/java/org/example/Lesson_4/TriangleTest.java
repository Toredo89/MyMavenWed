package org.example.Lesson_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TriangleTest {

    @Test
    void test() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(30,Triangle.Square(10,20,10));
        Assertions.assertThrows(MyException.class,()-> Triangle.Square(10,20,4));
    }
    @ParameterizedTest
    @CsvSource({})
    void testWithCsvSource(int a, int b, int c, int result) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(result,triangle.Square(a,b,c));

    }

    @ParameterizedTest
    @CsvSource({})
    void testWithCsvSourceN(int a, int b, int c, int result) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,()-> triangle.Square(a,b,c));

    }
}



package org.example.Lesson_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTwoTest {

    @Test
    void test() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(10.825317547305483,triangle.geroneSquare(5,5,5));
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            throw new IllegalArgumentException("-10,100,45");
        });
    }

    @ParameterizedTest
    @CsvSource({ "5,5,5,10.825317547305483"})
    void testWithCsvSource(double a, double b, double c, double result) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(result,triangle.geroneSquare(a,b,c));

    }

    @ParameterizedTest
    @CsvSource({ "-10,750,45"})
    void testWithCsvSourceN(double a, double b, double c) throws MyException {
        Triangle triangle = new Triangle();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,()-> {
            throw new IllegalArgumentException("error message");
        });

    }
}
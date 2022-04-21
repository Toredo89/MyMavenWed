package org.example.Lesson_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTwoTest {

    @Test
    void test() throws MyException {
        Triangle triangle = new Triangle();
        assertEquals(Triangle.Square(10,10,10),43);
    }
}

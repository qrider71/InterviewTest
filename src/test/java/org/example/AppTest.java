package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public final static List<Integer> allNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Test
    public void findEvenNumbersTest() {
        List<Integer> evenNumbers = App.findEvenNumbers(allNumbers);
    }
}

package Homework3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HW3test {
    //Тест на четность
    @Test
    void checkEvenNumber() {
        assertTrue(HW3.evenOddNumber(2));
    }

    //Тест на нечетность
    @Test
    void checkOddNumber() {
        assertFalse(HW3.evenOddNumber(1));
    }

    //Тест на попадание в заданный интервал
    @Test
    void checkNumberInInterval() {
        assertTrue(HW3.numberInInterval(25));
        assertTrue(HW3.numberInInterval(100));
    }

    //Тест на непопадание в заданный интервал
    @Test
    void checkNumberNotInInterval() {
        assertFalse(HW3.numberInInterval(24));
        assertFalse(HW3.numberInInterval(101));
    }
}

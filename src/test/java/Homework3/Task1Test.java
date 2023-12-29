package Homework3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
        //  Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false)
    void evenOddNumber() {
        Task1 task1 = new Task1();
        assertTrue(task1.evenOddNumber(8));
        assertFalse(task1.evenOddNumber(7));
    }

}
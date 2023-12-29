package Homework3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
        // Метод проверяет работу numberInInterval с аргументом 45, который подходит в интервал (25;100)
        // и 7, который  не подходит
    void numberInInterval() {
        Task2 task2 = new Task2();
        assertTrue(task2.numberInInterval(45));
        assertFalse(task2.numberInInterval(7));
    }
}
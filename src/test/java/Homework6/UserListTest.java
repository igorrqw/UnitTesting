package Homework6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserListTest {

    List<Integer> firstList = Arrays.asList(1, 3, 2, 7);
    List<Integer> secondList = Arrays.asList(5, 8, 6, 9);

    @Test
    void testCalculateAvgValue() {
        UserList userList = new UserList(firstList, secondList);

        double sum = 0;

        for (Integer num : firstList) {
            sum += num;
        }
        double avg = sum / firstList.size();

        assertEquals(avg, userList.calculateAverageValueList(userList.firstList));
    }

    @Test
    void testAvfFirstMoreThanSecondAvg() {
        UserList userList = new UserList(firstList, secondList);

        assertEquals("Второй список имеет большее среднее значение",
                userList.compareAvgValueLists(userList.firstList, userList.secondList));
    }

    @Test
    void testAvfFirstLessThanSecondAvg() {
        UserList userList = new UserList(secondList, firstList);

        assertEquals("Первый список имеет большее среднее значение",
                userList.compareAvgValueLists(userList.firstList, userList.secondList));
    }

    @Test
    void testAvfFirstEqualsSecondAvg() {
        UserList userList = new UserList(firstList, firstList);

        assertEquals("Средние значения равны", userList.compareAvgValueLists(userList.firstList, userList.secondList));
    }

    @Test
    void testCallCompareMethodWithEmptyArguments() {
        UserList userList = new UserList(firstList, firstList);

        assertEquals("Средние значения равны", userList.compareAvgValueLists());
    }
}
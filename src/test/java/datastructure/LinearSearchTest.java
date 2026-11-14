package datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LinearSearchTest {

    @Test
    void searchExistingValue() {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        int result = LinearSearch.search(numbers, 30);

        Assertions.assertEquals(2, result);
    }

    @Test
    void searchNonExistingValue() {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        int result = LinearSearch.search(numbers, 99);

        // TODO: 검색 실패 결과 검증
        Assertions.assertEquals(-1 , result);
    }

    @Test
    void searchEmptyList() {
        List<Integer> numbers = List.of();

        int result = LinearSearch.search(numbers, 10);

        // TODO: 결과 검증
        Assertions.assertEquals(-1, result);
    }
}

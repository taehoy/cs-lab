package datastructure;

import java.util.List;

public class LinearSearch {
    public static int search(
            List<Integer> numbers,
            int target
    ) {
        // TODO: 순차 검색 직접 구현
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                return i;
            }
        }

        return -1;
    }
}

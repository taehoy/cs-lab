package datastructure;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchBenchmark {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // TODO 1: 0부터 999까지 리스트에 추가
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }

        // TODO: 워밍업 10,000번 실행
        for (int i = 0; i < 10000; i++) {
            int result = LinearSearch.search(numbers, -1);

            if (result != -1) {
                throw new IllegalStateException("검색 결과 오류");
            }
        }
        // TODO 2: 검색 시작 시간 기록
        long startTime = System.nanoTime();

        // TODO 1: 검색 1,000번 반복 실행
        // TODO 2: 검색 결과를 활용해 결과 검증
        for (int i = 0; i < 1000; i++) {

            int result = LinearSearch.search(numbers, -1);

            if (result != -1) {
                throw new IllegalStateException("검색 결과 오류");
            }

        }

        long endTime = System.nanoTime();

        // TODO 3: 전체 경과 시간 계산
        long totalTime = endTime - startTime;
        System.out.println("전체 경과 시간 : " + totalTime);
        // TODO 4: 검색 1회당 평균 시간 계산
        double averageTime = totalTime / 1000.0;
        System.out.println("평균 시간 : " + averageTime);

    }
}

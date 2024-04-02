package study.nomoreFt.baseball;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumberGenerator {
    public String generateNumber(int length) {
        Set<Integer> numbers = new LinkedHashSet<>();
        while (numbers.size() < length) {
            int randomNum = (int) (Math.random() * 9) + 1; // 1부터 9까지의 무작위 숫자
            numbers.add(randomNum);
        }
        return numbers.stream().map(String::valueOf).reduce((acc, e) -> acc + e).orElse("");
    }
}

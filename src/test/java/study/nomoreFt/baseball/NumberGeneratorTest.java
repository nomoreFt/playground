package study.nomoreFt.baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    @RepeatedTest(value = 100, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void testGenerateThreeNumber() {
        NumberGenerator generator = new NumberGenerator();
        String result = generator.generateThreeNumber();

        // 결과가 정확히 3자리인지 확인
        Assertions.assertEquals(3, result.length());

        // 모든 숫자가 고유한지 확인
        Assertions.assertTrue(result.chars().distinct().count() == 3);

        // 모든 숫자가 1부터 9 사이인지 확인
        result.chars().forEach(c -> Assertions.assertTrue(c >= '1' && c <= '9'));
    }
}
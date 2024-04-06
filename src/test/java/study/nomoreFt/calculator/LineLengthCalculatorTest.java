package study.nomoreFt.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineLengthCalculatorTest {

    @Test
    void 두_점의_거리를_구한다() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        LineLengthCalculator lineLengthCalculator = new LineLengthCalculator(coordinate1, coordinate2);
        Assertions.assertEquals(6.403, lineLengthCalculator.calculate(),0.001);
    }

    @Test
    void 두_점의_거리를_출력한다() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);
        LineLengthCalculator lineLengthCalculator = new LineLengthCalculator(coordinate1, coordinate2);
        Assertions.assertEquals("두 점 사이의 거리는 6.403124", lineLengthCalculator.printResult());
    }



}
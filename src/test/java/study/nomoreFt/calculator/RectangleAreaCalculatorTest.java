package study.nomoreFt.calculator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaCalculatorTest {

    //생성테스트
    @Test
    void 직사각형_넓이_계산기_생성() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(22, 10);
        Coordinate coordinate3 = new Coordinate(22, 18);
        Coordinate coordinate4 = new Coordinate(10, 18);

        RectangleAreaCalculator rectangleAreaCalculator = RectangleAreaCalculator.create(List.of(coordinate1, coordinate2, coordinate3, coordinate4));
        assertNotNull(rectangleAreaCalculator);
    }

    @Test
    void 직사각형의_넓이를_구한다() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(22, 10);
        Coordinate coordinate3 = new Coordinate(22, 18);
        Coordinate coordinate4 = new Coordinate(10, 18);

        RectangleAreaCalculator rectangleAreaCalculator = RectangleAreaCalculator.create(List.of(coordinate1, coordinate2, coordinate3, coordinate4));
        assertEquals(96, rectangleAreaCalculator.calculate());
    }

    @Test
    void 직사각형의_넓이를_출력한다() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(22, 10);
        Coordinate coordinate3 = new Coordinate(22, 18);
        Coordinate coordinate4 = new Coordinate(10, 18);

        RectangleAreaCalculator rectangleAreaCalculator = RectangleAreaCalculator.create(List.of(coordinate1, coordinate2, coordinate3, coordinate4));
        assertEquals("사각형 넓이는 96", rectangleAreaCalculator.printResult());
    }

}
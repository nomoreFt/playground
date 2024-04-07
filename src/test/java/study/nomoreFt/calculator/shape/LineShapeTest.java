package study.nomoreFt.calculator.shape;

import org.junit.jupiter.api.Test;
import study.nomoreFt.calculator.Coordinate;

import static org.junit.jupiter.api.Assertions.*;

class LineShapeTest {

    @Test
    void 생성테스트() {
        LineShape lineShape = LineShape.create(new Coordinate(1, 1), new Coordinate(2, 2));
    }

    @Test
    void 라인은_두점으로_이루어져야한다() {
        assertThrows(IllegalArgumentException.class, () -> LineShape.create(new Coordinate(1, 1)));
    }






}
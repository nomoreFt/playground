package study.nomoreFt.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    @Test
    void    좌표는_최대_24까지만_입력할_수_있다() {
        assertThrows(AssertionError.class, () -> new Coordinate(25, 25));
    }

}
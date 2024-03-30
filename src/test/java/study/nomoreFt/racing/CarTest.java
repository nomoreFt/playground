package study.nomoreFt.racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CarTest {

    @DisplayName("자동차는 생성될 때 이름이 5자가 넘으면 안된다.")
    @Test
    void createTest() {
        // given
        String name = "abcdef";
        // when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car.of(name);
        });
        // then
    }

    @DisplayName("자동차는 random값이 4이상일경우 전진하고 true를 반환한다.")
    @ParameterizedTest(name = "random값이 {0}일때 전진하고 {2}를 반환한다.")
    @MethodSource("moveSuccessTest")
    void moveSuccessTest(int random, int expect, boolean moveCheck) {
        // given
        Car car = Car.of("car");
        // when
        boolean result = car.move(random);
        // then
        Assertions.assertEquals(expect, car.getPosition());
        Assertions.assertEquals(result, moveCheck);
    }

    private static Stream<Arguments> moveSuccessTest() {
        return Stream.of(
                Arguments.of(0, 0, false),
                Arguments.of(1, 0, false),
                Arguments.of(2, 0, false),
                Arguments.of(3, 0, false),
                Arguments.of(4, 1, true),
                Arguments.of(5, 1, true),
                Arguments.of(6, 1, true),
                Arguments.of(7, 1, true),
                Arguments.of(8, 1, true),
                Arguments.of(9, 1, true)
        );
    }

}

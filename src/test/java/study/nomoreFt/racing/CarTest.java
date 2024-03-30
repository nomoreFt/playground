package study.nomoreFt.racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import study.nomoreFt.racing.car.Car;
import study.nomoreFt.racing.car.ForwardOnFourMoveStrategy;
import study.nomoreFt.racing.car.MoveStrategy;

import java.util.Random;
import java.util.stream.Stream;

public class CarTest {

    private MoveStrategy moveStrategy;

    @BeforeEach
    void setUp() {
        moveStrategy = new ForwardOnFourMoveStrategy(() -> new Random().nextInt(10));
    }

    @DisplayName("자동차는 생성될 때 이름이 5자가 넘으면 안된다.")
    @Test
    void createTest() {
        // given
        String name = "abcdef";
        // when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car.of(name, moveStrategy);
        });
        // then
    }

    @ParameterizedTest(name = "random값이 {1}일때 {2}로 전진한다.")
    @MethodSource("moveSuccessTest")
    void moveSuccessTest(MoveStrategy random,int temp, int expect) {
        // given
        Car car = Car.of("car", random);
        // when
        car.move();
        // then
        Assertions.assertEquals(expect, car.getPosition());
    }

    private static Stream<Arguments> moveSuccessTest() {
        return Stream.of(
                Arguments.of(new ForwardOnFourMoveStrategy(() -> 0),0, 0),
                Arguments.of(new ForwardOnFourMoveStrategy(() -> 3),3, 0),
                Arguments.of(new ForwardOnFourMoveStrategy(() -> 4),4, 1),
                Arguments.of(new ForwardOnFourMoveStrategy(() -> 5),5, 1),
                Arguments.of(new ForwardOnFourMoveStrategy(() -> 6),6, 1),
                Arguments.of(new ForwardOnFourMoveStrategy(() -> 7),7, 1),
                Arguments.of(new ForwardOnFourMoveStrategy(() -> 8),8, 1),
                Arguments.of(new ForwardOnFourMoveStrategy(() -> 9),9, 1)
        );
    }

}

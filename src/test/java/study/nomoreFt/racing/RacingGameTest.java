package study.nomoreFt.racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import study.nomoreFt.racing.car.Car;
import study.nomoreFt.racing.car.ForwardOnFourMoveStrategy;
import study.nomoreFt.racing.car.MoveStrategy;

import java.util.List;
import java.util.Random;

public class RacingGameTest {

    private MoveStrategy moveStrategy;

    @BeforeEach
    void setUp() {
        moveStrategy = new ForwardOnFourMoveStrategy(() -> new Random().nextInt(10));
    }

    @Test
    void 자동차게임_생성_테스트(){
        // given
        List<Car> cars = List.of(Car.of("pobi",moveStrategy), Car.of("crong",moveStrategy), Car.of("honux",moveStrategy), Car.of("jk",moveStrategy));

        //then
        RacingGame racingGame = RacingGame.of(cars);
    }
}

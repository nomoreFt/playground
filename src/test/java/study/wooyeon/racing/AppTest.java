package study.wooyeon.racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import study.wooyeon.racing.io.OutputViewAdapter;
import study.wooyeon.racing.io.impl.ConsoleOutputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class AppTest {

    private final OutputViewAdapter output = new ConsoleOutputView();

    @Test
    @DisplayName("레이싱 게임이 정상적으로 완료된다.")
    public void success_racing() {

        // given
        List<Car> cars = Arrays.asList(new Car("히루"), new Car("하리"), new Car("우연"));
        int tryCount = 5;

        // when & then
        Racing racing = new Racing(cars);
        racing.race(tryCount);

        IntStream.range(0, tryCount).forEach(i -> {
            racing.moveCars();
            output.printStatus(cars);
        });

        RacingResult result = new RacingResult(cars);
        output.printWinners(result.getWinners());
    }

    @DisplayName("100회를 돌려도 모두 정상적으로 실행된다.")
    @RepeatedTest(value = 100, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void success_repeat_racing() {

        // given
        List<Car> cars = Arrays.asList(new Car("히루"), new Car("하리"), new Car("우연"));
        int tryCount = 5;

        // when & then
        Racing racing = new Racing(cars);
        racing.race(tryCount);

        IntStream.range(0, tryCount).forEach(i -> {
            racing.moveCars();
            output.printStatus(cars);
        });

        RacingResult result = new RacingResult(cars);
        output.printWinners(result.getWinners());
    }
}
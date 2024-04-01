package study.wooyeon.racing;

import study.wooyeon.racing.io.InputViewAdapter;
import study.wooyeon.racing.io.OutputViewAdapter;
import study.wooyeon.racing.io.impl.ConsoleInputView;
import study.wooyeon.racing.io.impl.ConsoleOutputView;

import java.util.List;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        InputViewAdapter input = new ConsoleInputView();
        OutputViewAdapter output = new ConsoleOutputView();

        List<Car> cars = input.inputCars();
        int tryCount = input.inputTryCount();

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

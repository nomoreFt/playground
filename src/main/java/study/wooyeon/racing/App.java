package study.wooyeon.racing;

import java.util.List;

public class App {
    public static void main(String[] args) {
        InputView input = new InputView();
        OutputView output = new OutputView();

        List<Car> cars = input.inputCars();
        int tryCount = input.inputTryCount();

        Racing racing = new Racing(cars);
        racing.race(tryCount);

        for (int i = 0; i < tryCount; i++) {
            racing.moveCars();
            output.printStatus(cars);
        }

        List<Car> winners = racing.getWinners();
        output.printWinners(winners);
    }
}

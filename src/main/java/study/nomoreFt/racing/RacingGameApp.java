package study.nomoreFt.racing;

import study.nomoreFt.racing.adapter.ConsoleInputAdapter;
import study.nomoreFt.racing.adapter.ConsoleOutputAdapter;
import study.nomoreFt.racing.car.*;

public class RacingGameApp {
    public static void main(String[] args) {

        InputAdapter inputAdapter = ConsoleInputAdapter.create();
        OutputAdapter outputAdapter = ConsoleOutputAdapter.create();
        CarNameParser carNameParser = CarNameParser.create();
        MoveStrategy moveStrategy = new ForwardOnFourMoveStrategy(() -> (int) (Math.random() * 10));

        Cars cars = Cars.of(carNameParser.parse(inputAdapter.inputCar()));
        cars.setMoveStrategy(moveStrategy);

        int round = inputAdapter.inputRound();
        RacingGame racingGame = RacingGame.of(cars);

        outputAdapter.startOutput();
        for (int i = 0; i < round; i++) {
            racingGame.playRound();
            outputAdapter.outputRound(cars.printPositions());
        }
        outputAdapter.outputResult(cars.printWinners());

    }
}

package study.nomoreFt.baseball;

import study.nomoreFt.baseball.io.ConsoleInputAdapter;
import study.nomoreFt.baseball.io.ConsoleOutputAdapter;
import study.nomoreFt.baseball.strategy.BallCountingStrategy;
import study.nomoreFt.baseball.strategy.StrikeCountingStrategy;

public class App {
    public static void main(String[] args) {
        InputAdapter inputAdapter = new ConsoleInputAdapter();
        OutputAdapter outputAdapter = new ConsoleOutputAdapter();


        NumberGenerator numberGenerator = new NumberGenerator();
        String answer = numberGenerator.generateNumber(3);


        CountingStrategy ballCountingStrategy = new BallCountingStrategy();
        CountingStrategy strikeCountingStrategy = new StrikeCountingStrategy();
        Umpire umpire = Umpire.of(answer, ballCountingStrategy, strikeCountingStrategy);

        ResultHandler resultHandler = new ResultHandler();



        PlayGame playGame = PlayGame.of(answer, umpire);


        boolean endStatus = false;
        while(!endStatus) {
            String guess = inputAdapter.inputGuess();
            ScoreBoard scoreBoard = playGame.play(guess);
            endStatus = resultHandler.handleResult(scoreBoard, inputAdapter, outputAdapter);

        }

        inputAdapter.afterAll();
    }
}

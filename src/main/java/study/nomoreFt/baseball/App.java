package study.nomoreFt.baseball;

import study.nomoreFt.baseball.io.ConsoleInputAdapter;
import study.nomoreFt.baseball.io.ConsoleOutputAdapter;
import study.nomoreFt.baseball.strategy.BallCountingStrategy;
import study.nomoreFt.baseball.strategy.StrikeCountingStrategy;

public class App {
    public static void main(String[] args) {
        InputAdapter inputAdapter = new ConsoleInputAdapter();
        OutputAdapter outputAdapter = new ConsoleOutputAdapter();
        ResultHandler resultHandler = new ResultHandler();

        NumberGenerator numberGenerator = new NumberGenerator();
        String answer = numberGenerator.generateThreeNumber();


        CountingStrategy ballCountingStrategy = new BallCountingStrategy();
        CountingStrategy strikeCountingStrategy = new StrikeCountingStrategy();
        Umpire umpire = Umpire.of(answer, ballCountingStrategy,strikeCountingStrategy);

        PlayGame playGame = PlayGame.of(answer, umpire);


        boolean isThreeStrike = false;
        while(!isThreeStrike) {
            String guess = inputAdapter.inputGuess();
            ResultCount resultCount = playGame.play(guess);
            outputAdapter.outputResult(resultCount);
            resultHandler.handleResult(resultCount, inputAdapter, outputAdapter);

        }



    }
}

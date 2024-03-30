package study.nomoreFt.baseball.strategy;

import study.nomoreFt.baseball.CountingStrategy;
import study.nomoreFt.baseball.ScoreBoard;

public final class StrikeCountingStrategy implements CountingStrategy {
    @Override
    public void addCountToResult(String answer, String guess, ScoreBoard scoreBoard) {
        for(int i = 0; i < 3; i++) {
            if(answer.charAt(i) == guess.charAt(i)) {
                scoreBoard.addStrike();
            }
        }
    }
}

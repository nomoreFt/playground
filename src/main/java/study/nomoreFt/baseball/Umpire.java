package study.nomoreFt.baseball;

import java.util.List;

/**
 * 심판 역할
 * - 정답과 사용자의 입력을 비교하여 결과를 알려준다.
 * - 상태로 정답과 Ball,Strike 측정 전략을 가진다.
 */
public class Umpire {
    private List<CountingStrategy> strategies;

    private Umpire(CountingStrategy... strategies) {
        this.strategies = List.of(strategies);
    }

    public static Umpire of(String answer, CountingStrategy... strategies) {
        return new Umpire(strategies);
    }

    public ScoreBoard judge(String answer, String guess) {
        ScoreBoard scoreBoard = ScoreBoard.initialize();

        for (CountingStrategy strategy : strategies) {
            strategy.addCountToResult(answer, guess, scoreBoard);

        }
        return scoreBoard;
    }

}

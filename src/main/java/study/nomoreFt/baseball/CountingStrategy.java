package study.nomoreFt.baseball;

public interface CountingStrategy {
    void addCountToResult(String answer, String guess, ScoreBoard scoreBoard);
}

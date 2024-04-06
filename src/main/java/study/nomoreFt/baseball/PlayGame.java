package study.nomoreFt.baseball;

public class PlayGame {
    private String answer;
    private Umpire umpire;

    private PlayGame(String answer, Umpire umpire) {
        this.answer = answer;
        this.umpire = umpire;
    }

    public static PlayGame of(String answer, Umpire umpire) {
        return new PlayGame(answer, umpire);
    }

    public ScoreBoard play(String guess) {
        return umpire.judge(answer, guess);
    }


}

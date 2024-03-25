package study.nomoreFt.baseball;

public class ResultCount {
    private int strike;
    private int ball;

    public int getStrikeCount() {
        return strike;
    }

    public int getBallCount() {
        return ball;
    }

    private ResultCount(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public static ResultCount initialize() {
        return new ResultCount(0, 0);
    }

    public void addStrike() {
        strike++;
    }

    public void addBall() {
        ball++;
    }

    public boolean isNothing() {
        return strike == 0 && ball == 0;
    }

    public boolean isAllMatch() {
        return strike == 3;
    }

    public boolean hasStrike() {
        return strike > 0;
    }

    public boolean hasBall() {
        return ball > 0;
    }
}

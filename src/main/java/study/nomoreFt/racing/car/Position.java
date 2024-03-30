package study.nomoreFt.racing.car;

public class Position {
    private int position;

    protected Position() {
    }

    private Position(int position) {
        this.position = position;
    }

    public static Position create() {
        return new Position(0);
    }
    public void add() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }
}

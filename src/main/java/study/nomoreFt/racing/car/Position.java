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

    public int getPosition() {
        return this.position;
    }

    public void forward(int distance) {
        this.position += distance;
    }
}

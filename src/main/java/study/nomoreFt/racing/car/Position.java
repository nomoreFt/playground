package study.nomoreFt.racing.car;

import study.nomoreFt.racing.Validator;

public class Position implements Validator {
    private int position;

    protected Position() {
    }

    private Position(int position) {
        valid();
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


    @Override
    public void valid() {
        if (this.position < 0) {
            throw new IllegalArgumentException("위치는 0 이상이어야 합니다.");
        }
    }
}

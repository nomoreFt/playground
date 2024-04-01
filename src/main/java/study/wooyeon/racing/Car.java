package study.wooyeon.racing;

import lombok.Getter;

import java.util.concurrent.ThreadLocalRandom;

@Getter
public class Car {
    private final String name;
    private int position;
    private static final int MOVE_THRESHOLD = 4;

    public Car(String name) {
        Validator.checkLength(name.length());
        this.name = name;
        this.position = 0;
    }

    public void moveIfMovable() {
        if (isMovable()) {
            move();
        }
    }

    public boolean isMovable() {
        return ThreadLocalRandom.current().nextInt(10) >= MOVE_THRESHOLD;
    }

    public void move() {
        position++;
    }
}

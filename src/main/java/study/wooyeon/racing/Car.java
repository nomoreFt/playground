package study.wooyeon.racing;

import lombok.Getter;
import study.wooyeon.racing.message.Exception;

import java.util.concurrent.ThreadLocalRandom;

@Getter
public class Car implements Validator<Integer>{
    private final String name;
    private int position;

    public Car(String name) {
        validation(name.length());
        this.name = name;
        this.position = 0;
    }

    public void moveIfMovable() {
        if (isMovable()) {
            move();
        }
    }

    public boolean isMovable() {
        return ThreadLocalRandom.current().nextInt(Option.랜덤범위.getOption()) >= Option.차량이동.getOption();
    }

    public void move() {
        position++;
    }

    @Override
    public void validation(Integer carNameLength) {
        if (carNameLength > Option.길이제한.getOption()) {
            throw new IllegalArgumentException(Exception.길이제한.getMessage());
        }
    }
}

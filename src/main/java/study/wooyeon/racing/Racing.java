package study.wooyeon.racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private final List<Car> cars;
    private static final int MOVE_THRESHOLD = 4;


    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public void race(int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            moveCars();
        }
    }

    public void moveCars() {
        for (Car car : cars) {
            if (isMovable()) {
                car.move();
            }
        }
    }

    private boolean isMovable() {
        Random random = new Random();
        return random.nextInt(10) >= MOVE_THRESHOLD;
    }

    public List<Car> getWinners() {
        List<Car> winners = new ArrayList<>();
        int maxPosition = getMaxPosition();

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car);
            }
        }
        return winners;
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }
}

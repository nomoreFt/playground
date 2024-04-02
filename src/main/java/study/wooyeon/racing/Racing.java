package study.wooyeon.racing;

import java.util.List;
import java.util.stream.IntStream;

public class Racing {

    private final List<Car> cars;

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public void race(Integer tryCount) {
        IntStream.range(0, tryCount).forEach(i -> moveCars());
    }

    public void moveCars() {
        cars.forEach(Car::moveIfMovable);
    }
}

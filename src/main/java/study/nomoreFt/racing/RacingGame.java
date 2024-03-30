package study.nomoreFt.racing;

import study.nomoreFt.racing.car.Car;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RacingGame {
    private final Set<Car> cars = new LinkedHashSet<>();
    private int round;

    public RacingGame(List<Car> cars) {
        this.cars.addAll(cars);
        this.round = 0;
    }

    public static RacingGame of(List<Car> cars) {
        return new RacingGame(cars);
    }

    public void playRound() {
        this.round++;
        for (Car car : cars) {
            car.move();
        }
    }
}

package study.nomoreFt.racing;

import study.nomoreFt.racing.car.Car;
import study.nomoreFt.racing.car.Cars;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RacingGame {
    private final Cars cars;
    private int round;

    public RacingGame(Cars cars) {
        this.cars = cars;
        this.round = 0;
    }

    public static RacingGame of(Cars cars) {
        return new RacingGame(cars);
    }

    public void playRound() {
        this.round++;
        cars.move();
    }
}

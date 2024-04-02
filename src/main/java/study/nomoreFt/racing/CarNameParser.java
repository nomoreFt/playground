package study.nomoreFt.racing;

import study.nomoreFt.racing.car.Car;

import java.util.List;
import java.util.stream.Stream;

public class CarNameParser {

    public static CarNameParser create() {
        return new CarNameParser();
    }

    public List<Car> parse(String carNames) {
        return Stream.of(carNames.split(","))
                .map(Car::of)
                .toList();
    }
}

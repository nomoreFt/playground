package study.nomoreFt.racing.car;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {
    private final Set<Car> cars = new LinkedHashSet<>();

    private Cars(List<Car> cars) {
        this.cars.addAll(cars);
    }

    public static Cars of(List<Car> cars) {
        return new Cars(cars);
    }

    public void move() {
        for (Car car : cars) {
            car.move();
        }
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        for (Car car : cars) {
            car.setMoveStrategy(moveStrategy);
        }
    }

    public String printPositions() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.printPosition()).append("\n");
        }
        return sb.toString();
    }

    public String printWinners() {
        int maxPosition = getMaxPosition();

        // 우승자 필터링
        List<Car> winners = this.cars.stream()
                .filter(car -> car.isWinner(maxPosition))
                .collect(Collectors.toList());

        // 우승자 이름 연결
        String winnerNames = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));

        return winnerNames;
    }

    private int getMaxPosition() {
        return this.cars.stream()
                .mapToInt(Car::getPosition)
                .max().getAsInt();
    }
}

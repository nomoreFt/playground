package study.nomoreFt.racing;

import study.nomoreFt.racing.adapter.ConsoleInputAdapter;
import study.nomoreFt.racing.car.Car;
import study.nomoreFt.racing.car.CarName;

import java.util.List;

public class App {
    public static void main(String[] args) {

        InputAdapter inputAdapter = ConsoleInputAdapter.create();
        CarNameParser carNameParser = CarNameParser.create();
        List<Car> cars = carNameParser.parse(inputAdapter.inputCar());

    }
}

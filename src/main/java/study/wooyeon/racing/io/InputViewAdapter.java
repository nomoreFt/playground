package study.wooyeon.racing.io;

import study.wooyeon.racing.Car;

import java.util.List;

public interface InputViewAdapter {
    List<Car> inputCars();
    int inputTryCount();
}

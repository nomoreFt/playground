package study.wooyeon.racing.io;

import study.wooyeon.racing.Car;

import java.util.List;

public interface OutputViewAdapter {
    void printStatus(List<Car> cars);
    void printWinners(List<Car> winners);
}

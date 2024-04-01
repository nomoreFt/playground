package study.wooyeon.racing.io.impl;

import study.wooyeon.racing.Car;
import study.wooyeon.racing.io.OutputViewAdapter;
import study.wooyeon.racing.message.Output;

import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleOutputView implements OutputViewAdapter {

    private final PrintStream printStream;

    public ConsoleOutputView() {
        this.printStream = System.out;
    }

    // For testing purposes
    public ConsoleOutputView(PrintStream printStream) {
        this.printStream = printStream;
    }
    @Override
    public void printStatus(List<Car> cars) {
        cars.forEach(car -> System.out.println(car.getName() + " : " + "-".repeat(car.getPosition())));
        System.out.println();
    }

    @Override
    public void printWinners(List<Car> winners) {
        String winnersNames = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));

        System.out.println(Output.최종우승_출력.getMessage().replace("*", winnersNames));
    }

}

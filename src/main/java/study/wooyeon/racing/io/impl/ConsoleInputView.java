package study.wooyeon.racing.io.impl;

import study.wooyeon.racing.Car;
import study.wooyeon.racing.io.InputViewAdapter;
import study.wooyeon.racing.message.Input;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleInputView implements InputViewAdapter {

    private final Scanner scanner;
    private static final String DELIMITER = ",";

    public ConsoleInputView() {
        this.scanner = new Scanner(System.in);
    }

    // For testing purposes
    public ConsoleInputView(ByteArrayInputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    @Override
    public List<Car> inputCars() {
        System.out.print(Input.자동차이름_입력.getMessage());
        String carNamesInput = scanner.nextLine();
        String[] carNames = carNamesInput.split(DELIMITER);

        return Arrays.stream(carNames)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    @Override
    public int inputTryCount() {
        System.out.print(Input.시도횟수_입력.getMessage());
        return Integer.parseInt(scanner.nextLine());
    }
}

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

    private static final ConsoleInputView consoleInputView = new ConsoleInputView();
    private final Scanner scanner = new Scanner(System.in);

    private ConsoleInputView() {
    }

    @Override
    public String inputCars() {
        System.out.print(Input.자동차이름_입력.getMessage());
        return scanner.nextLine();
    }

    @Override
    public int inputTryCount() {
        System.out.print(Input.시도횟수_입력.getMessage());
        return Integer.parseInt(scanner.nextLine());
    }

    public static ConsoleInputView getInstance() {
        return consoleInputView;
    }
}

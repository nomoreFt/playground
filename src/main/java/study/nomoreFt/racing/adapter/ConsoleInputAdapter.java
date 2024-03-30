package study.nomoreFt.racing.adapter;

import study.nomoreFt.racing.InputAdapter;

import java.util.Scanner;

public class ConsoleInputAdapter implements InputAdapter {
    private Scanner scanner;

    public ConsoleInputAdapter() {
        this.scanner = new Scanner(System.in);
    }

    public static ConsoleInputAdapter create() {
        return new ConsoleInputAdapter();
    }

    @Override
    public String inputCar() {
        System.out.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).\n");
        return scanner.nextLine();
    }
}

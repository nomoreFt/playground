package study.nomoreFt.calculator.adapter;

import study.nomoreFt.calculator.InputAdapter;

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
    public String inputCoordinates() {
        System.out.println("좌표를 입력하세요.");
        return scanner.nextLine();
    }
}

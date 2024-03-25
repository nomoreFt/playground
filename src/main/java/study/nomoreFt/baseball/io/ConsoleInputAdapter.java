package study.nomoreFt.baseball.io;

import study.nomoreFt.baseball.InputAdapter;

import java.util.Scanner;

public class ConsoleInputAdapter implements InputAdapter {
    private Scanner scanner;

    public ConsoleInputAdapter() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String inputGuess() {
        System.out.print("숫자를 입력해 주세요 : ");
        return scanner.nextLine();
    }

    @Override
    public void afterAll() {
        scanner.close();
    }

    @Override
    public int promptRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Integer.parseInt(scanner.nextLine());
    }
}

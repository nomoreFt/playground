package study.nomoreFt.racing;

import study.nomoreFt.racing.adapter.ConsoleInputAdapter;

public class App {
    public static void main(String[] args) {

        InputAdapter inputAdapter = ConsoleInputAdapter.create();
        String carNames = inputAdapter.inputCar();
    }
}

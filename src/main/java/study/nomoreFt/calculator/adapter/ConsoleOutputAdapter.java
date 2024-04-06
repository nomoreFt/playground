package study.nomoreFt.calculator.adapter;

import study.nomoreFt.racing.OutputAdapter;

public class ConsoleOutputAdapter implements OutputAdapter {
    public static OutputAdapter create() {
        return new ConsoleOutputAdapter();
    }

    @Override
    public void startOutput() {
        System.out.println("\n실행 결과");
    }

    public void outputRound(String roundResult) {
        System.out.println(roundResult);
    }

    public void outputResult(String result) {
        System.out.print(result+"가 최종 우승했습니다.");
    }
}

package study.wooyeon.racing;

import java.util.List;

public class OutputView {
    public void printStatus(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinners(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < winners.size(); i++) {
            sb.append(winners.get(i).getName());
            if (i < winners.size() - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb + "가 최종 우승했습니다.");
    }
}

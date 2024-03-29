package study.wooyeon.racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String DELIMITER = ",";

    public List<Car> inputCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분): ");
        String carNamesInput = scanner.nextLine();
        String[] carNames = carNamesInput.split(DELIMITER);
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
            }
            cars.add(new Car(carName));
        }
        return cars;
    }

    public int inputTryCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시도할 회수는 몇회인가요? ");
        return Integer.parseInt(scanner.nextLine());
    }
}

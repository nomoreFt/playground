package study.wooyeon.racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    private static final Parser parser = new Parser();
    private static final String DELIMITER = ",";

    private Parser() {}

    public List<Car> getListCar(String carNamesInput) {
        String[] carNames = carNamesInput.split(DELIMITER);

        return Arrays.stream(carNames)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public static Parser getInstance() {
        return parser;
    }

}

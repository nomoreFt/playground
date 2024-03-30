package study.nomoreFt.racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import study.nomoreFt.racing.car.Car;

import java.util.List;

public class StringParserTest {

    @Test
    void 콤마기준으로_문자열_나눠_자동차객체로_생성() {
        // given
        CarNameParser parser = CarNameParser.create();
        String carNames = "pobi,crong,honux";

        // when
        List<Car> cars =  parser.parse(carNames);

        // then
        Assertions.assertEquals(3, cars.size());
        Assertions.assertEquals("pobi", cars.get(0).getName());
        Assertions.assertEquals("crong", cars.get(1).getName());
        Assertions.assertEquals("honux", cars.get(2).getName());
    }
}

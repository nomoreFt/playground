package study.nomoreFt.racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @DisplayName("자동차는 생성될 때 이름이 5자가 넘으면 안된다.")
    @Test
    void createTest() {
        // given
        String name = "abcdef";
        // when
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car.of(name);
        });
        // then
    }

}

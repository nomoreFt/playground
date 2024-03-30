package study.nomoreFt.racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import study.nomoreFt.MainTest;

import static study.nomoreFt.Assertions.assertSimpleTest;

public class RacingAppTest extends MainTest {

    @Test
    void 자동차명_입력() {
        assertSimpleTest(() -> {
            run("pobi,crong,honux");
            Assertions.assertTrue(output().contains("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."));
        });
    }



    @Override
    protected void runMain() {
        App.main(new String[]{});
    }
}

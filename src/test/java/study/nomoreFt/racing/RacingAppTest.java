package study.nomoreFt.racing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import study.nomoreFt.MainTest;


public class RacingAppTest extends MainTest {


    @Test
    void 입력_테스트() {
        // run 메서드와 output 메서드가 테스트 환경에 맞게 적절히 구현되었다고 가정
        run("pobi,crong,honux", "5");

        String expectedText1 = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
        String expectedText2 = "시도할 회수는 몇회인가요?";
        String expectedText3 = "실행 결과";
        String actualOutput = output();

        Assertions.assertAll("출력 검증",
                () -> Assertions.assertTrue(actualOutput.contains(expectedText1),
                        "출력 결과에 예상되는 첫 번째 텍스트가 포함되어 있지 않습니다."),
                () -> Assertions.assertTrue(actualOutput.contains(expectedText2),
                        "출력 결과에 예상되는 두 번째 텍스트가 포함되어 있지 않습니다."),
                () -> Assertions.assertTrue(actualOutput.contains(expectedText3),
                        "출력 결과에 예상되는 세 번째 텍스트가 포함되어 있지 않습니다.")
        );
    }


    @Override
    protected void runMain() {
        RacingGameApp.main(new String[]{});
    }
}

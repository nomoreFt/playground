package study.wooyeon.racing.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Input {

    자동차이름_입력("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분): "),
    시도횟수_입력("시도할 회수는 몇회인가요? ");
    private String message;
}

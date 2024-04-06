package study.wooyeon.racing.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Output {

    최종우승_출력("*가 최종 우승했습니다.");

    private String message;


}

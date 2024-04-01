package study.wooyeon.racing.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Exception {

    길이제한("자동차 이름은 5자 이하여야 합니다.");

    private String message;
}

package study.wooyeon.racing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Option {
    랜덤범위(10),
    차량이동(4),
    길이제한(5);

    private Integer option;
}

package study.wooyeon.baseball.v1.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GameOption {
    GAME_SIZE(3),
    THREE_STRIKE(3),
    RESTART(1),
    GAME_END(2);

    private final int option;
}

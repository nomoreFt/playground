package study.wooyeon.baseball.v1;

import lombok.Getter;
import study.wooyeon.baseball.v1.constant.GameOption;

import java.util.Random;

@Getter
public class Computer {

    private final int size = GameOption.GAME_SIZE.getOption(); // default 3
    private final String computerNumbers;

    public Computer() {
        this.computerNumbers = generateNumber();
    }

    public String generateNumber() {
        // 필요한 객체 선언
        StringBuilder numbers = new StringBuilder();
        Random random = new Random();
        // 랜덤 값 만들기
        for (int i = 0 ; i < size ; i ++) {
            numbers.append(random.nextInt(9));
        }
        // 반환
        return numbers.toString();
    }
}

package study.wooyeon.baseball.v1;

import study.wooyeon.baseball.v1.constant.GameOption;

public class Validator {

    private static final Integer gameSize = GameOption.GAME_SIZE.getOption();

    public static boolean isMatchGameSize(Integer inputPlayerNumbersLength) {
        if (inputPlayerNumbersLength > gameSize) {
            System.out.println("게임의 자릿수 는 " + gameSize + " 입니다. 자릿수를 맞춰 입력해주세요.");
            return true;
        }
        return false;
    }

}

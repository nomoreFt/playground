package study.wooyeon.baseball.v1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import study.wooyeon.baseball.v1.constant.GameOption;

import java.util.Scanner;

// todo. 게임 결과값(strike, ball)을 ex. GameResult로 분리하기
@NoArgsConstructor
@AllArgsConstructor
public class GameManager {
    private int strike;
    private int ball;
    private boolean isGameEnd = false;

    public GameManager(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public void compare(String playerNumbers, String computerNumbers) {

        int strike = 0;
        int ball = 0;
        int[] playerNumber = getStringToIntArray(playerNumbers);
        int[] computerNumber = getStringToIntArray(computerNumbers);

        GameManager result = getGameResult(strike, ball, playerNumber, computerNumber);

        if (result.strike == GameOption.THREE_STRIKE.getOption()) {
            System.out.println("3스트라이크");
            isGameEnd = true;
        }

        System.out.printf("%s 스트라이크 %s 볼 %n", result.strike, result.ball);

        if (result.strike == 0 & result.ball == 0) {
            System.out.println("낫싱");
        }
    }

    public boolean isContinue() {

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner input = new Scanner(System.in);
        System.out.print("입력 : ");
        int inputValue = input.nextInt();
        return inputValue == GameOption.RESTART.getOption();
    }

    private GameManager getGameResult(int strike, int ball, int[] playerNumber, int[] computerNumber) {
        for (int i = 0; i < GameOption.GAME_SIZE.getOption(); ++i) {
            if (playerNumber[i] == computerNumber[i]) {
                strike++;
            }
            ball = checkBall(ball, playerNumber, computerNumber, i);
        }
        return new GameManager(strike, ball);
    }

    private int checkBall(int ball, int[] playerNumber, int[] computerNumber, int i) {
        for (int j = 0; j < computerNumber.length; j++) {
            if (playerNumber[i] == computerNumber[j] && i != j) {
                ball++;
                break;
            }
        }
        return ball;
    }

    public int[] getStringToIntArray(String str) {
        char[] charArray = str.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i] - '0';
        }
        
        return intArray;
    }

    public boolean isGameEnd(){
        return this.isGameEnd;
    }
}

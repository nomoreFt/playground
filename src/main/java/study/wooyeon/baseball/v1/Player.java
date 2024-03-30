package study.wooyeon.baseball.v1;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
@Getter
public class Player {

    private String playerNumbers;

    public void InputPlayerNumber() {

        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        String InputPlayerNumbers = input.next();

        this.playerNumbers = InputPlayerNumbers;
    }

}

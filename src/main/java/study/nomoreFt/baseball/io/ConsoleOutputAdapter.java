package study.nomoreFt.baseball.io;

import study.nomoreFt.baseball.OutputAdapter;
import study.nomoreFt.baseball.ScoreBoard;

public class ConsoleOutputAdapter implements OutputAdapter {
    @Override
    public void outputResult(ScoreBoard scoreBoard) {
        StringBuilder sb = new StringBuilder();

        // 볼 개수가 0개가 아니면 볼 개수를 문자열로 변환하여 sb에 추가
        if(scoreBoard.hasBall()) {
            sb.append(scoreBoard.getBallCount()).append("볼 ");
        }
        // 스트라이크 개수가 0개가 아니면 스트라이크 개수를 문자열로 변환하여 sb에 추가
        if(scoreBoard.hasStrike()) {
            sb.append(scoreBoard.getStrikeCount()).append("스트라이크 ");
        }

        // 스트라이크와 볼 개수가 모두 0개이면 "낫싱"을 sb에 추가
        if(scoreBoard.isNothing()) {
            sb.append("낫싱");
        }

        // 최종 결과 문자열을 콘솔에 출력
        System.out.println(sb.toString());
    }

    @Override
    public void outputGameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}

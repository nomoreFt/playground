package study.nomoreFt.baseball;

public class ResultHandler {

    public boolean handleResult(ScoreBoard scoreBoard
            , InputAdapter inputAdapter
            , OutputAdapter outputAdapter) {
        boolean endStatus = false;

        outputAdapter.outputResult(scoreBoard); //1볼 2스트라이크 출력

        if (!scoreBoard.isAllMatch()) return endStatus;

        outputAdapter.outputGameEnd(); //3개의 숫자를 모두 맞히셨습니다! 게임 종료
        int userContinue = inputAdapter.promptRestart(); //게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
        if (userContinue == 2) {
            endStatus = true;
            return endStatus;
        }

        return endStatus;

    }
}

package study.nomoreFt.baseball;

public class ResultHandler {

    public boolean handleResult(ResultCount resultCount
            , InputAdapter inputAdapter
            , OutputAdapter outputAdapter) {
        outputAdapter.outputResult(resultCount);

        if (!resultCount.isAllMatch()) return false;


        outputAdapter.outputGameEnd();
        int userContinue = inputAdapter.promptRestart();
        if (userContinue == 2) {
            inputAdapter.afterAll();
            return false;
        }

        return true;

    }
}

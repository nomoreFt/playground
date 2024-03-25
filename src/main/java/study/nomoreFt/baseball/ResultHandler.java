package study.nomoreFt.baseball;

public class ResultHandler {

    public boolean handleResult(ResultCount resultCount
            , InputAdapter inputAdapter
            , OutputAdapter outputAdapter) {
        boolean endStatus = false;

        outputAdapter.outputResult(resultCount);

        if (!resultCount.isAllMatch()) return endStatus;


        outputAdapter.outputGameEnd();
        int userContinue = inputAdapter.promptRestart();
        if (userContinue == 2) {
            endStatus = true;
            return endStatus;
        }

        return endStatus;

    }
}

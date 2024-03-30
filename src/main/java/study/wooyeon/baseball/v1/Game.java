package study.wooyeon.baseball.v1;

public class Game {

    private final Player player;
    private Computer computer;

    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public void start() {

        while (true) {

            // input playerNumbers
            player.InputPlayerNumber();

            // validation
            if (Validator.isMatchGameSize(player.getPlayerNumbers().length())) {
                continue;
            };

            // Log
            // System.out.println("playerNumbers = " + player.getPlayerNumbers() + ", computerNumbers = " + computer.getComputerNumbers());

            // play games
            GameManager gameManager = new GameManager();
            gameManager.compare(player.getPlayerNumbers(), computer.getComputerNumbers());

            if (gameManager.isGameEnd()) {
                boolean isContinue = gameManager.isContinue();

                if (isContinue) {
                    computer = new Computer();
                } else {
                    break;
                }
            }

        }
    }


}

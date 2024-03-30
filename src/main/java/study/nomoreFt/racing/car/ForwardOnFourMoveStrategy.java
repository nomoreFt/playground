package study.nomoreFt.racing.car;

import study.nomoreFt.racing.RandomNumberGenerator;

public class ForwardOnFourMoveStrategy implements MoveStrategy{
    private RandomNumberGenerator randomNumberGenerator;

    public ForwardOnFourMoveStrategy(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }
    @Override
    public void move(Car car) {
        if (randomNumberGenerator.generateRandomNumber() >= 4) {
            car.forward(1);
        }
    }
}

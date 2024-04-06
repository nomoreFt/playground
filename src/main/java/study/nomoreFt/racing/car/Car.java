package study.nomoreFt.racing.car;



public class Car {
    private final CarName name;
    private final Position position;
    private MoveStrategy moveStrategy;

    public Car(String name, MoveStrategy moveStrategy) {
        this.name = CarName.of(name);
        this.position = Position.create();
        this.moveStrategy = moveStrategy;
    }

    public static Car of(String name, MoveStrategy moveStrategy) {
        return new Car(name, moveStrategy);
    }

    public static Car of(String name) {
        return new Car(name, null);
    }

    public void move() {
        moveStrategy.move(this);
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    public String getName() {
        return this.name.getName();
    }

    public void forward(int distance) {
        this.position.forward(distance);
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public String printPosition() {
        return this.name.getName() + " : " + "-".repeat(this.position.getPosition());
    }

    public boolean isWinner(int maxPosition) {
        return this.position.getPosition() == maxPosition;
    }
}

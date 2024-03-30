package study.nomoreFt.racing;



public class Car {
    private final CarName name;
    private final Position position;

    public Car(String name) {
        this.name = CarName.of(name);
        this.position = Position.create();
    }

    public static Car of(String name) {
        return new Car(name);
    }

    public boolean move(int random) {
        if (random >= 4) {
            this.position.add();
            return true;
        }
        return false;
    }

    public int getPosition() {
        return this.position.getPosition();
    }
}

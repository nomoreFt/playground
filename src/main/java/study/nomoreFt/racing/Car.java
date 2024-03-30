package study.nomoreFt.racing;



public class Car {
    private final String name;
    private Position position;

    public Car(String name) {
        this.name = name;
        this.position = Position.create();
    }

    public static Car of(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }

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

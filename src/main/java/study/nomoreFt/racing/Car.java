package study.nomoreFt.racing;

public class Car {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public static Car of(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }

        return new Car(name);

    }

}

package study.nomoreFt.racing.car;

public class CarName {
    private String name;
    private CarName() {
    }

    private CarName(String name) {
        this.name = name;
    }
    public static CarName of(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }

        return new CarName(name);
    }
}

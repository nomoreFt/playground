package study.nomoreFt.racing.car;

import study.nomoreFt.racing.CarNameParser;
import study.nomoreFt.racing.Validator;

public class CarName implements Validator<String> {
    private String name;
    private int age;
    private CarName() {
    }

    private CarName(String name) {
        valid();
        this.name = name;
    }
    public static CarName of(String name) {

        return new CarName(name);
    }

    public String getName() {
        return this.name;
    }

    //static 메서드에 못쓰나??
    @Override
    public void valid() {
        if (this.name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }

        if(this.age < 0) {
            throw new IllegalArgumentException("나이는 0 이상이어야 합니다.");
        }

    }
}

package study.nomoreFt.calculator.shape;

import study.nomoreFt.calculator.Coordinate;
import study.nomoreFt.calculator.Shape;
import study.nomoreFt.calculator.ShapeValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RectangleShape implements Shape, ShapeValidator {
    private List<Coordinate> coordinates;

    private RectangleShape(List<Coordinate> coordinates) {
        this.coordinates = new ArrayList<>(coordinates);
        valid();
    }

    public static RectangleShape create(List<Coordinate> coordinates) {
        Collections.sort(coordinates);
        return new RectangleShape(coordinates);
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return coordinates.stream().anyMatch(coordinate -> coordinate.match(x, y));
    }

    @Override
    public void valid() {
        if (coordinates.size() != 4) {
            throw new IllegalArgumentException("사각형은 네 점으로 이루어져야 합니다.");
        }

        //직사각형 검사

        if(coordinates.get(0).matchX(coordinates.get(1))  || coordinates.get(2).matchX(coordinates.get(3))
                || coordinates.get(0).matchY(coordinates.get(3)) || coordinates.get(1).matchY(coordinates.get(2))){
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
    }

    public Double getArea() {
        double a = coordinates.get(0).distance(coordinates.get(1));
        double b = coordinates.get(1).distance(coordinates.get(2));

        return a * b;
    }
}

package study.nomoreFt.calculator.shape;

import study.nomoreFt.calculator.Coordinate;
import study.nomoreFt.calculator.Shape;
import study.nomoreFt.calculator.ShapeValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriangleShape implements Shape, ShapeValidator {
    private List<Coordinate> coordinates;

    private TriangleShape(List<Coordinate> coordinates) {
        this.coordinates = new ArrayList<>(coordinates);
        valid();
    }

    public static TriangleShape create(List<Coordinate> coordinates) {
        Collections.sort(coordinates);
        return new TriangleShape(coordinates);
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return coordinates.stream().anyMatch(coordinate -> coordinate.match(x, y));
    }

    @Override
    public void valid() {
        if (coordinates.size() != 3) {
            throw new IllegalArgumentException("삼각형은 세 점으로 이루어져야 합니다.");
        }
    }

    public Double getArea() {
        double a = coordinates.get(0).distance(coordinates.get(1));
        double b = coordinates.get(1).distance(coordinates.get(2));
        double c = coordinates.get(2).distance(coordinates.get(0));
        double s = (a + b + c) / 2;

        return Double.valueOf(Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c))));
    }
}

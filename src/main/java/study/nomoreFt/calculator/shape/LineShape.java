package study.nomoreFt.calculator.shape;

import study.nomoreFt.calculator.Coordinate;
import study.nomoreFt.calculator.Shape;
import study.nomoreFt.calculator.ShapeValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineShape implements Shape, ShapeValidator {
    private List<Coordinate> coordinates;

    private LineShape(List<Coordinate> coordinates) {
        this.coordinates = new ArrayList<>(coordinates);
        valid();
    }

    public static LineShape create(Coordinate... coordinates) {
        List<Coordinate> sortedList = new ArrayList<>(List.of(coordinates));
        Collections.sort(sortedList);
        return new LineShape(sortedList);
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return coordinates.stream().anyMatch(coordinate -> coordinate.match(x, y));
    }

    @Override
    public void valid() {
        if (coordinates.size() != 2) {
            throw new IllegalArgumentException("선분은 두 점으로 이루어져야 합니다.");
        }
    }

    public Double getDistance() {
        return coordinates.get(0).distance(coordinates.get(1));
    }
}

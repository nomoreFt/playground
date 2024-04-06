package study.nomoreFt.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RectangleAreaCalculator implements Calculator, PrintCalculateResult, ShapeValidator{
    private List<Coordinate> coordinates;
    private final double width;
    private final double height;

    private RectangleAreaCalculator(double width, double height, List<Coordinate> coordinates) {
        this.coordinates = coordinates;
        valid();
        this.width = width;
        this.height = height;
    }

    //create
    public static RectangleAreaCalculator create(List<Coordinate> coordinates) {
        coordinates = new ArrayList<>(coordinates);
        Collections.sort(coordinates);

        Coordinate coordinate1 = coordinates.get(0);
        Coordinate coordinate2 = coordinates.get(1);
        Coordinate coordinate3 = coordinates.get(2);
        Coordinate coordinate4 = coordinates.get(3);

        double width = Math.abs(coordinate1.x - coordinate3.x);
        double height = Math.abs(coordinate1.y - coordinate2.y);

        return new RectangleAreaCalculator(width, height, coordinates);
    }

    @Override
    public Double calculate() {
        return width * height;
    }

    @Override
    public String printResult() {
        return "사각형 넓이는 " + calculate().intValue();
    }

    @Override
    public void valid() {
        if (coordinates.size() != 4) {
            throw new IllegalArgumentException("꼭지점이 네 개가 아닙니다.");
        }


        //직사각형 검사

        if(coordinates.get(0).x != coordinates.get(1).x || coordinates.get(2).x != coordinates.get(3).x){
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }

    }
}

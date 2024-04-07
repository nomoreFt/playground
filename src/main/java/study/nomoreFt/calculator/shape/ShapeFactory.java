package study.nomoreFt.calculator.shape;

import study.nomoreFt.calculator.Calculator;
import study.nomoreFt.calculator.Coordinate;
import study.nomoreFt.calculator.Shape;
import study.nomoreFt.calculator.calculator.LineLengthCalculator;
import study.nomoreFt.calculator.calculator.RectangleAreaCalculator;
import study.nomoreFt.calculator.calculator.TriangleAreaCalculator;

import java.util.List;


public class ShapeFactory {

    public static Shape createShape(List<Coordinate> coordinates) {

        if(coordinates.size() == 4) {
            return RectangleShape.create(coordinates);
        }
        if (coordinates.size() == 3) {
            return TriangleShape.create(coordinates);
        }
        if (coordinates.size() == 2) {
            return LineShape.create(coordinates.get(0), coordinates.get(1));
        }
        throw new IllegalArgumentException("지원하지 않는 도형입니다.");
    }

    public static Calculator createCalculator(Shape shape) {
        if (shape instanceof TriangleShape) {
            return TriangleAreaCalculator.create(shape);
        }
        if (shape instanceof RectangleShape) {
            return RectangleAreaCalculator.create(shape);
        }
        if (shape instanceof LineShape) {
            return LineLengthCalculator.create(shape);
        }
        throw new IllegalArgumentException("지원하지 않는 도형입니다.");
    }
}

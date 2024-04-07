package study.nomoreFt.calculator.calculator;

import study.nomoreFt.calculator.*;
import study.nomoreFt.calculator.shape.RectangleShape;

public class RectangleAreaCalculator implements Calculator{
    private RectangleShape retangleShape;
    private RectangleAreaCalculator(Shape retangleShape) {
        this.retangleShape = (RectangleShape) retangleShape;
    }

    public static RectangleAreaCalculator create(Shape retangleShape) {
        return new RectangleAreaCalculator(retangleShape);
    }


    @Override
    public Double calculate() {
        return retangleShape.getArea();
    }

    @Override
    public String printResult() {
        return "사각형 넓이는 " + calculate().intValue();
    }

}

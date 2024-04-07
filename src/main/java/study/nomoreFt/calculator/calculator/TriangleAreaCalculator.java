package study.nomoreFt.calculator.calculator;

import study.nomoreFt.calculator.*;
import study.nomoreFt.calculator.shape.TriangleShape;


public class TriangleAreaCalculator implements Calculator{
    private TriangleShape triangleShape;

    private TriangleAreaCalculator(Shape triangleShape) {
        this.triangleShape = (TriangleShape) triangleShape;
    }

    public static TriangleAreaCalculator create(Shape triangleShape) {
        return new TriangleAreaCalculator(triangleShape);
    }

    @Override
    public Double calculate() {
        //헤론의 공식
        return triangleShape.getArea();
    }

    @Override
    public String printResult() {
        return "삼각형 넓이는 " + String.format("%.0f", calculate());
    }

}

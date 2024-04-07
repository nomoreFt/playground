package study.nomoreFt.calculator.calculator;

import study.nomoreFt.calculator.Calculator;
import study.nomoreFt.calculator.Shape;
import study.nomoreFt.calculator.shape.LineShape;

public class LineLengthCalculator implements Calculator{
    private LineShape lineShape;

    private LineLengthCalculator(Shape lineShape) {
        this.lineShape = (LineShape) lineShape;
    }

    public static LineLengthCalculator create(Shape lineShape) {
        return new LineLengthCalculator(lineShape);
    }



    @Override
    public Double calculate() {
        return lineShape.getDistance();
    }

    @Override
    public String printResult() {
        return "두 점 사이의 거리는 " + String.format("%.6f", calculate());
    }
}

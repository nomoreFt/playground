package study.nomoreFt.calculator;

import study.nomoreFt.calculator.adapter.ConsoleInputAdapter;
import study.nomoreFt.calculator.adapter.ConsoleOutputAdapter;
import study.nomoreFt.calculator.adapter.CoordinateParser;
import study.nomoreFt.calculator.shape.LineShape;
import study.nomoreFt.calculator.shape.ShapeFactory;

import java.util.List;

public class CalculatorApp {
    public static void main(String[] args) {

        ConsoleInputAdapter inputAdapter = ConsoleInputAdapter.create();
        OutputAdapter outputAdapter = ConsoleOutputAdapter.create();

        List<Coordinate> coordinates;
        while (true) {
            try {
                String inputCoordinates = inputAdapter.inputCoordinates();
                coordinates = CoordinateParser.parse(inputCoordinates);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 입력입니다. 좌표는 24 이하의 값을 가져야 합니다. 다시 입력해주세요.");
            }
        }

        Shape shape = ShapeFactory.createShape(coordinates);
        Calculator calculator = ShapeFactory.createCalculator(shape);


        outputAdapter.outputStart(shape);
        outputAdapter.outputResult(calculator);


    }
}

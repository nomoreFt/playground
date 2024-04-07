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

        String inputCoordinates = inputAdapter.inputCoordinates();
        List<Coordinate> coordinates =  CoordinateParser.parse(inputCoordinates);
        Shape shape = ShapeFactory.createShape(coordinates);
        Calculator calculator = ShapeFactory.createCalculator(shape);


        outputAdapter.outputStart(shape);
        outputAdapter.outputResult(calculator);


    }
}

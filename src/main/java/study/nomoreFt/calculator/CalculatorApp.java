package study.nomoreFt.calculator;

import study.nomoreFt.calculator.adapter.ConsoleInputAdapter;
import study.nomoreFt.calculator.adapter.CoordinateParser;

import java.util.List;

public class CalculatorApp {
    public static void main(String[] args) {
        ConsoleInputAdapter inputAdapter = ConsoleInputAdapter.create();
        String inputCoordinates = inputAdapter.inputCoordinates();

        List<Coordinate> coordinates =  CoordinateParser.parse(inputCoordinates);
    }
}

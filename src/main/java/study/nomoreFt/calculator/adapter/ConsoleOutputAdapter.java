package study.nomoreFt.calculator.adapter;

import study.nomoreFt.calculator.*;
import study.nomoreFt.calculator.shape.ShapeFactory;

import java.util.List;

public class ConsoleOutputAdapter implements OutputAdapter {
    private static final String FOUR_BLANK = "  ";
    private static final String PIPELINE = "|";
    private static final String POINT_MARK = "*";
    private static final String PLUS_MARK = "+";
    private static final String HORIZONTAL_LINE = "--";
    private static final String NEW_LINE = System.lineSeparator();
    private static final int MAX_VALUE = 24;
    private StringBuilder sb = new StringBuilder();
    public static OutputAdapter create() {
        return new ConsoleOutputAdapter();
    }

    public void draw(Shape shape) {
        clear();
        drawVerticalLinesAndPoints(shape);
        drawHorizontalLine();
        drawHorizontalNumbers();
        show();
    }

    private void clear() {
        sb.setLength(0);
    }

    private void drawVerticalLinesAndPoints(Shape shape) {
        for (int y = MAX_VALUE; y >= 0; y--) {
            drawVerticalLine(y);
            drawPointsForLine(y, shape);
            sb.append(NEW_LINE);
        }
    }

    private void drawVerticalLine(int y) {
        if (y % 2 == 0) {
            sb.append(String.format("%2d%s", y, PIPELINE));
        } else {
            sb.append(FOUR_BLANK).append(PIPELINE);
        }
    }

    private void drawPointsForLine(int y, Shape shape) {
        for (int x = 1; x <= MAX_VALUE; x++) {
            sb.append(shape.hasPoint(x, y) ? POINT_MARK : FOUR_BLANK);
        }
    }

    private void drawHorizontalLine() {
        sb.append(FOUR_BLANK).append(PLUS_MARK);
        for (int x = 1; x <= MAX_VALUE; x++) {
            sb.append(HORIZONTAL_LINE);
        }
        sb.append(NEW_LINE);
    }

    private void drawHorizontalNumbers() {
        sb.append(FOUR_BLANK); // Initial space for alignment
        for (int x = 2; x <= MAX_VALUE; x += 2) {
            sb.append(String.format("%4d", x));
        }
    }

    private void show() {
        System.out.println(sb.toString());
    }

    @Override
    public void outputStart(Shape shape) {
        draw(shape);
    }

    @Override
    public void outputResult(Calculator result) {
        System.out.println(result.printResult());
    }
}
